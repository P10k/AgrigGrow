package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgetPassword extends AppCompatActivity {

    Button forgetButton;
    EditText txtEmail;
    String email;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    FirebaseAuth mAuht;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forget_password);


        mAuht=FirebaseAuth.getInstance();
        txtEmail=findViewById(R.id.fgtEmail);
        forgetButton=findViewById(R.id.forgtbtn);

        forgetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateEmail();
            }
        });

    }

    private void validateEmail()
    {
        email=txtEmail.getText().toString();

        if (!email.matches(emailPattern)) {
            txtEmail.setError("Enter correct Email");
        }else
        {
            forgotPass();
        }

    }

    private void forgotPass()
    {
        mAuht.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(ForgetPassword.this,"check your Email",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(ForgetPassword.this,Login.class));
                    finish();
                }else
                {
                    Toast.makeText(ForgetPassword.this,"Error: "+task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}