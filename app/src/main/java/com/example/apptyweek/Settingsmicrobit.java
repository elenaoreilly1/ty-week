package com.example.apptyweek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Settingsmicrobit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settingsmicrobit);
    }

    public void microbitvideo(View v) {
        //launch a new activity

        Intent i = new Intent(this, microbitvideo1.class);
        startActivity(i);
    }
}