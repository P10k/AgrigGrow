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

public class Reset_Password extends AppCompatActivity {

    Button resetButton;
    EditText txTEmail;
    String email;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    FirebaseAuth mAuht;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reset_password);

        mAuht=FirebaseAuth.getInstance();
        txTEmail=findViewById(R.id.reset_Email);
        resetButton=findViewById(R.id.resetBtn);

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateEmail();
            }
        });

    }

    private void validateEmail() {

        email=txTEmail.getText().toString();

        if (!email.matches(emailPattern)) {
            txTEmail.setError("Enter correct Email");
        }else
        {
            forgotPass();
        }
    }

    private void forgotPass() {
        mAuht.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(Reset_Password.this,"check your Email",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Reset_Password.this,Login.class));
                    finish();
                }else
                {
                    Toast.makeText(Reset_Password.this,"Error: "+task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}