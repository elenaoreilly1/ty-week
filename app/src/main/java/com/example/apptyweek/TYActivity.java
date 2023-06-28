package com.example.apptyweek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TYActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ty);
    }

    public void launchsettings(View v) {
        //launch a new activity

        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);

    }

    public void agilesettings(View v) {
        //launch a new activity

        Intent i = new Intent(this, agileActivity.class);
        startActivity(i);
    }

    public void pythonSettings(View v) {
        //launch a new activity

        Intent i = new Intent(this, SettingsPython.class);
        startActivity(i);
    }

    public void htmlsettings(View v) {
        //launch a new activity

        Intent i = new Intent(this, Settingshtml.class);
        startActivity(i);
    }

    public void internetsecuritysettings(View v) {
        //launch a new activity

        Intent i = new Intent(this, Settingsinternetsecurity.class);
        startActivity(i);
    }
    public void microbitsettings(View v) {
        //launch a new activity

        Intent i = new Intent(this, Settingsmicrobit.class);
        startActivity(i);
    }
}
