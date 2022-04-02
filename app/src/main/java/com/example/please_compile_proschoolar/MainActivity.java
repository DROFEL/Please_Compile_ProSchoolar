package com.example.please_compile_proschoolar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class  MainActivity extends AppCompatActivity {
    private Student currentStudent;


    public Student getCurrentStudent() {
        return currentStudent;
    }

    public void setCurrentStudent(Student currentStudent) {
        this.currentStudent = currentStudent;
    }

    public static MainActivity instance = null;

    //MAIN LAYOUT
    public static View mainView;
    private Button btnMainLogin;
    private Button btnMainAddTask;
    private Button btnMainLeft;
    private Button btnMainRight;
    private TextView txvMainTitle;

    // TASK INFORMATION
    public static View taskView;
    private TextView txvMainTaskName;
    private TextView txvMainTaskCourse;
    private TextView txvMainTaskGradePrecent;
    private TextView txvMainTaskGradeWeight;
    private TextView txvMainTaskDueDate;

    //LOGIN LAYOUT
    public static View loginView;
    private TextView txvLoginTitle;
    private EditText etxtLoginName;
    private EditText etxtLoginPassword;
    private Button btnLoginSubmit;
    private Button btnLoginSignup;


    //SIGNUP LAYOUT
    public static View signupView;
    private TextView txvSignupTitle;
    private EditText etxtSignupName;
    private EditText etxtSignupPassword;
    private Button btnSignupRegister;
    private Button btnSignupReturn;

    private  Button btnAddTask;
    private TextView title;
    private TextView test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instance = this;


    }
    // MAIN BUTTONS
    public void gotoLoginScreen(View view) {
        //Intent intent = new Intent(this, LoginActivity.class);
        //startActivity(intent);

        setContentView(R.layout.login_layout);
        //DataSingle ds = DataSingle.getInstance();

    }
    public void btnMainAddTaskClick(View view){
        //setContentView(R.layout.activity_main);
        Log.d("success","function ran");
        txvMainTitle.setText("Add task");



        setContentView(R.layout.test_layout);
        DataSingle.getInstance();
    }
    public void addTaskClicked(View view){
        title.setText("Add task");
    }

    public void btnLoginSubmitClick(View view){
        //Log them in
        //loop thru the student data we have saved
        //if the name and password matches, change the student object in main with the matched one
    }

    public void btnLoginSignupClick(View view){
        setContentView(R.layout.signup_layout);
    }

    // SIGNUP BUTTONS
    public void btnSignupRegisterClick(View view){
        //register the student instance
        setContentView(R.layout.signup_layout);
        String regName = etxtSignupName.getText().toString();
        String regPass = etxtSignupPassword.getText().toString();
        Student regStudent = new Student(regName,regPass);
        DataSingle ds = DataSingle.getInstance();
        ds.setSessionStudent(regStudent);
        setCurrentStudent( ds.getSessionStudent());

    }

    public void btnSignupReturnClick(View view){
        //should send back to main, using to test the student object
        //setContentView(R.layout.activity_main);
        DataSingle ds = DataSingle.getInstance();
       String dsUsername = getCurrentStudent().getUsername();
       Log.d("student","new student " + dsUsername);

    }



    public static void main(String[] args) {

    }
}