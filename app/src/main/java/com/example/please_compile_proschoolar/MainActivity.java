package com.example.please_compile_proschoolar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class  MainActivity extends AppCompatActivity {
    private Student currentStudent;
<<<<<<< HEAD
<<<<<<< HEAD

    public Student getCurrentStudent() {
        return currentStudent;
    }

    public void setCurrentStudent(Student currentStudent) {
        this.currentStudent = currentStudent;
    }

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
=======
    private Button btnMainLogin;
    private  Button btnAddTask;
    private TextView title;
    private TextView test;

>>>>>>> parent of e61260d (everything is inside the MainActivity.java file now)
=======
    private Button btnMainLogin;
    private  Button btnAddTask;
    private TextView title;
    private TextView test;

>>>>>>> parent of e61260d (everything is inside the MainActivity.java file now)

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
<<<<<<< HEAD
        //MAIN LAYOUT
       // mainView = R.layout.activity_main;
        setContentView(R.layout.activity_main);
        btnMainLogin = (Button) findViewById(R.id.btnMainLogin);
        btnMainAddTask = (Button) findViewById(R.id.btnMainAddTask);
        btnMainLeft = (Button) findViewById(R.id.btnMainLeft);
        btnMainRight = (Button) findViewById(R.id.btnMainRight);
        txvMainTitle = (TextView) findViewById(R.id.txvMainTitle);

        //TASK LAYOUT
        txvMainTaskName =(TextView) findViewById(R.id.txvMainTaskName);
        txvMainTaskCourse =(TextView) findViewById(R.id.txvMainTaskCourse);
        txvMainTaskGradePrecent =(TextView) findViewById(R.id.txvMainTaskGradePercent);
        txvMainTaskGradeWeight =(TextView) findViewById(R.id.txvMainTaskGradeWeight);
        txvMainTaskDueDate =(TextView) findViewById(R.id.txvMainTaskDueDate);

        //LOGIN LAYOUT
        setContentView(R.layout.login_layout);
        txvLoginTitle = (TextView) findViewById(R.id.txvLoginTitle);
        etxtLoginName = (EditText) findViewById(R.id.etxtLoginName);
        etxtLoginPassword = (EditText) findViewById(R.id.etxtLoginPassword);
        btnLoginSignup = (Button) findViewById(R.id.btnLoginSignup);
        btnLoginSubmit = (Button) findViewById(R.id.btnLoginSubmit);

        //SIGNUP LAYOUT
        setContentView(R.layout.signup_layout);
        txvSignupTitle = (TextView) findViewById(R.id.txvSignupTitle);
        etxtSignupName = (EditText) findViewById(R.id.etxtSignupName);
        etxtSignupPassword = (EditText) findViewById(R.id.etxtSignupPassword);
        btnSignupRegister = (Button) findViewById(R.id.btnSignupRegister);
        btnSignupReturn = (Button) findViewById(R.id.btnSignupReturn);

        setContentView(R.layout.activity_main);


=======
        btnMainLogin = (Button) findViewById(R.id.btnMainLogin);
=======
        btnMainLogin = (Button) findViewById(R.id.btnMainLogin);
>>>>>>> parent of e61260d (everything is inside the MainActivity.java file now)
        btnAddTask = (Button) findViewById(R.id.btnMainLogin);
        title = (TextView) findViewById(R.id.txvMainTitle);
        test = (TextView) findViewById(R.id.txvTestText);
        test.setText();
<<<<<<< HEAD
>>>>>>> parent of e61260d (everything is inside the MainActivity.java file now)
=======
>>>>>>> parent of e61260d (everything is inside the MainActivity.java file now)
    }
    // MAIN BUTTONS
    public void gotoLoginScreen(View view) {
        //Intent intent = new Intent(this, LoginActivity.class);
        //startActivity(intent);
<<<<<<< HEAD
<<<<<<< HEAD
        setContentView(R.layout.login_layout);
        //DataSingle ds = DataSingle.getInstance();

    }
    public void btnMainAddTaskClick(View view){
        //setContentView(R.layout.activity_main);
        Log.d("success","function ran");
        txvMainTitle.setText("Add task");


=======
        setContentView(R.layout.test_layout);
        DataSingle.getInstance()
    }
    public void addTaskClicked(View view){
        title.setText("Add task");
>>>>>>> parent of e61260d (everything is inside the MainActivity.java file now)
    }

    public void btnLoginSubmitClick(View view){
        //Log them in
        //loop thru the student data we have saved
        //if the name and password matches, change the student object in main with the matched one
    }

    public void btnLoginSignupClick(View view){
        setContentView(R.layout.signup_layout);
=======
        setContentView(R.layout.test_layout);
        DataSingle.getInstance()
    }
    public void addTaskClicked(View view){
        title.setText("Add task");
>>>>>>> parent of e61260d (everything is inside the MainActivity.java file now)
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