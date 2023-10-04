package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchLogin(View v){
        Intent x = new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(x);
    }

    public void switchRegister(View v){
        Intent y = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(y);
    }
}