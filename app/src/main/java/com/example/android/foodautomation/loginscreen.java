package com.example.android.foodautomation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen);
    }

    public void login(View view) {
        startActivity(new Intent(loginscreen.this,bottom_navigation2.class));
    }

    public void register(View view) {
        startActivity(new Intent(loginscreen.this,registration_activity.class));
    }
}
