package com.example.please_compile_proschoolar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class  MainActivity extends AppCompatActivity {
    private Student currentStudent;
    private Button btnMainLogin;
    private  Button btnAddTask;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMainLogin = (Button) findViewById(R.id.btnMainLogin);
        btnAddTask = (Button) findViewById(R.id.btnMainLogin);
        title = (TextView) findViewById(R.id.txvMainTitle);
    }
    public void gotoLoginScreen(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    public void addTaskClicked(View view){
        title.setText("Add task");
    }


    public static void main(String[] args) {

    }
}