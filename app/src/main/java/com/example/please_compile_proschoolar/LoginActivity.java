package com.example.please_compile_proschoolar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    String userName = "";
    String userPass = "";
    ArrayList<Student> studentArray  = new ArrayList<Student>();

    private Button btnSignup;

    public void addStudent(Student student){
        studentArray.add(student);
       // Log.d("Student class methods", "Added new student with username" + student.getUsername() + " and password " + student.getPassword());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnSignup = (Button) findViewById(R.id.btnRegister);

    }
    public void gotoSignupScreen(View view) {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent); 
    }
}