package com.example.android.easternathletics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoccerTeamInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soccer_team_info);
    }
    public void SoccerRoster(View v) {
        startActivity(new Intent(SoccerTeamInfo.this, SoccerRoster.class));
    }
}
