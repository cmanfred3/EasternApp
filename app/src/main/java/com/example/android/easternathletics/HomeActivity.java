package com.example.android.easternathletics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.onClick;
import static android.os.Build.VERSION_CODES.M;
import static android.provider.AlarmClock.EXTRA_MESSAGE;
import static com.example.android.easternathletics.R.layout.activity_home;
import static com.example.android.easternathletics.R.layout.activity_soccer_team_info;
import static com.example.android.easternathletics.R.layout.activity_soccer_roster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void soccerTeamInfo(View v) {
        startActivity(new Intent(HomeActivity.this, SoccerTeamInfo.class));
    }

    public void SoccerRoster(View v) {
        startActivity(new Intent(HomeActivity.this, SoccerRoster.class));
    }
}