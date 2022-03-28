package com.example.please_compile_proschoolar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    public SignupActivity() {

    }
    String registerName;
    String registerPass;
    EditText registerNameInput;
    EditText registerPassInput;
    Button btnRegister;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);



        registerNameInput = (EditText) findViewById(R.id.etxtUsername);
        registerPassInput = (EditText) findViewById(R.id.etxtPassword);
        output = (TextView) findViewById(R.id.txtvOutput);

        btnRegister = (Button) findViewById(R.id.btnRegister);

    }
    public void registerUser(View view){
        registerName = registerNameInput.getText().toString();
        registerPass = registerPassInput.getText().toString();
        Student registeringStudent =  makeStudent(registerName,registerPass);
        //NO OBJECT INSTANCE, CAN'T ASSIGN ANYTHING
        // loginActivity.addStudent(registeringStudent)
    }

    public Student makeStudent(String name, String pass){
        output.setText(name+ " " + pass);
        return new Student(name,pass);
    }
}