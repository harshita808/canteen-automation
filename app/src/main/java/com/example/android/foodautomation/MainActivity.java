package com.example.android.foodautomation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void user(View view) {
        Intent userIntent = new Intent(MainActivity.this, bottom_navigation.class);
        startActivity(userIntent);
    }
    public void admin(View view) {
       Intent adminIntent = new Intent(MainActivity.this, loginscreen.class);
        startActivity(adminIntent);
    }


}


