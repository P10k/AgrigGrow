package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.login.LoginManager;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Setting_info extends AppCompatActivity {
    TextView reset_pass,contact_US,about_US;
    Button logOut_btn;

    FirebaseAuth mAuth;

    CallbackManager callbackManager;

    GoogleSignInOptions gso;
    GoogleSignInClient gsc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_info);

        //firebase
        mAuth= FirebaseAuth.getInstance();
        FirebaseUser currentUser=FirebaseAuth.getInstance().getCurrentUser();

        //facebook
        callbackManager=CallbackManager.Factory.create();
        AccessToken accessToken=AccessToken.getCurrentAccessToken();

        //google
        gso=new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc= GoogleSignIn.getClient(this,gso);
        GoogleSignInAccount accnt=GoogleSignIn.getLastSignedInAccount(this);


        reset_pass=findViewById(R.id.chnage_password);
        reset_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reset=new Intent(Setting_info.this,Reset_Password.class);
                startActivity(reset);
            }
        });

        contact_US=findViewById(R.id.contact_us);
        contact_US.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cont=new Intent(Setting_info.this,Contact_Us.class);
                startActivity(cont);
            }
        });

        about_US=findViewById(R.id.about_us);
        about_US.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about=new Intent(Setting_info.this,About_Us.class);
                startActivity(about);
            }
        });



        logOut_btn=findViewById(R.id.logoutbtn);
        logOut_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(currentUser != null){

                mAuth.signOut();
                Intent login=new Intent(Setting_info.this,Login.class);
                //login.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(login);
                finish();

                }else if(accessToken!=null&&accessToken.isExpired()==false){

                    LoginManager.getInstance().logOut();
                    startActivity(new Intent(Setting_info.this,Login.class));
                    finish();

                }else if(accnt!=null){

                    gsc.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            finish();;
                            startActivity(new Intent(Setting_info.this,Login.class));
                        }
                    });

                }else
                {
                    Toast.makeText(Setting_info.this,"something went wrong",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }



}