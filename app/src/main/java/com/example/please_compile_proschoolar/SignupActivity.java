package com.example.please_compile_proschoolar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import java.util.ArrayList;

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

        btnSignup = (Button) findViewById(R.id.btnSignup);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerName = registerNameInput.getText().toString();
                registerPass = registerPassInput.getText().toString();
                Student registeringStudent =  makeStudent(registerName,registerPass);
                // Add student to login list.
            }
        });

    }
    public Student makeStudent(String name, String pass){
        Student newStudent = new Student(name,pass);
        return newStudent;
    }
}