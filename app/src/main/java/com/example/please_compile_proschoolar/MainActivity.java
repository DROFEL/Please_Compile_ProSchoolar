package com.example.please_compile_proschoolar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class  MainActivity extends AppCompatActivity {

    private Student currentStudent;

    //MAIN LAYOUT
    private Button btnMainLogin;
    private Button btnMainAddTask;
    private Button btnMainLeft;
    private Button btnMainRight;
    private TextView txvMainTitle;

    // TASK INFORMATION
    private TextView txvMainTaskName;
    private TextView txvMainTaskCourse;
    private TextView txvMainTaskGradePrecent;
    private TextView txvMainTaskGradeWeight;
    private TextView txvMainTaskDueDate;

    //LOGIN LAYOUT
    private TextView txvLoginTitle;
    private EditText etxtLoginName;
    private EditText etxtLoginPassword;
    private Button btnLoginSubmit;
    private Button btnLoginSignup;


    //SIGNUP LAYOUT
    private TextView txvSignupTitle;
    private EditText etxtSignupName;
    private EditText etxtSignupPassword;
    private Button btnSignupRegister;
    private Button btnSignupReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MAIN LAYOUT
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
        txvLoginTitle = (TextView) findViewById(R.id.txvLoginTitle);
        etxtLoginName = (EditText) findViewById(R.id.etxtLoginName);
        etxtLoginPassword = (EditText) findViewById(R.id.etxtLoginPassword);
        btnLoginSignup = (Button) findViewById(R.id.btnLoginSignup);
        btnLoginSubmit = (Button) findViewById(R.id.btnLoginSubmit);

        //SIGNUP LAYOUT
        txvSignupTitle = (TextView) findViewById(R.id.txvSignupTitle);
        etxtSignupName = (EditText) findViewById(R.id.etxtSignupName);
        etxtSignupPassword = (EditText) findViewById(R.id.etxtSignupPassword);
        btnSignupRegister = (Button) findViewById(R.id.btnSignupRegister);
        btnSignupReturn = (Button) findViewById(R.id.btnSignupReturn);



    }
    public void gotoLoginScreen(View view) {
        //Intent intent = new Intent(this, LoginActivity.class);
        //startActivity(intent);
        setContentView(R.layout.login_layout);
       // DataSingle.getInstance();
    }
    public void addTaskClicked(View view){
        txvMainTitle.setText("Add task");
    }


    public static void main(String[] args) {

    }
}