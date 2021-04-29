package com.example.android.foodautomation;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.foodautomation.R;

public class cart_screen extends AppCompatActivity {

    int noOfFood=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart_screen);


    }
    public void next(View view) {
        Intent intent = new Intent(cart_screen.this,pay.class);
        startActivity(intent);
    }

    public void decrement(View view) {
        if (noOfFood > 0) {
            noOfFood -= 1;
            display(noOfFood);
        }
    }
        public void increment (View view){
            if (noOfFood >= 0 && noOfFood < 100)
                noOfFood += 1;
            display(noOfFood);
        }
        private void display ( int number){
            TextView quantityTextView = (TextView) findViewById(R.id.button1);
            quantityTextView.setText("" + number);
            TextView cart = (TextView) findViewById(R.id.cart);
            cart.setText("" + number);
        }
    }

