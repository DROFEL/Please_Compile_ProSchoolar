package com.example.please_compile_proschoolar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {
    String registerName;
    String registerPass;
    EditText registerNameInput;
    EditText registerPassInput;
    Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        registerNameInput = (EditText) findViewById(R.id.etxtUsername);
        registerNameInput = (EditText) findViewById(R.id.etxtPassword);

    }
}