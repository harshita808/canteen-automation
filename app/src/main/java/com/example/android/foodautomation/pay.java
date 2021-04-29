package com.example.android.foodautomation;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.example.android.foodautomation.R;

public class pay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_confirmation);
    }

    public void pay(View view) {
        Intent intent = new Intent(pay.this,payment_screen.class);
        startActivity(intent);
    }

}