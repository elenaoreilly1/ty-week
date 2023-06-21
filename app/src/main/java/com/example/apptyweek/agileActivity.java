package com.example.apptyweek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class agileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agile);
    }

    public void agileSettings(View v) {
        //launch a new activity

        Intent i = new Intent(this, agileActivity.class);
        startActivity(i);
    }
    public void scrumteamvideo(View v) {
        //launch a new activity

        Intent i = new Intent(this, scrumteamsettings.class);
        startActivity(i);
    }
}