package com.example.please_compile_proschoolar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Student currentStudent;
    private Button btnMainLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMainLogin = (Button) findViewById(R.id.btnMainLogin);

        btnMainLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoLoginScreen();
            }
        });


    }
    public void gotoLoginScreen() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }



}