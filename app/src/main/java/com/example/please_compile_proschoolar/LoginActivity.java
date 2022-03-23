package com.example.please_compile_proschoolar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    String userName = "";
    String userPass = "";
    Student[] studentArray;

    private Button btnSignup;
    
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnSignup = (Button) findViewById(R.id.btnSignup);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoSignupScreen();
            }
        });
    }
    public void gotoSignupScreen() {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent); 
    }
}