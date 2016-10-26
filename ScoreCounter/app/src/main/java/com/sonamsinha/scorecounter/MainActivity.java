package com.sonamsinha.scorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView scoreViewA;
    TextView scoreViewB;
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreViewA = (TextView)findViewById(R.id.team_A_score);
        scoreViewB = (TextView)findViewById(R.id.team_B_score);
    }

    public void teamAScore(int score){
        scoreViewA.setText(String.valueOf(score));
    }

    public void addThreePointstoTeamA(View view){
        scoreA = scoreA + 3;
        teamAScore(scoreA);
    }

    public void addTwoPointstoTeamA(View view){
        scoreA = scoreA + 2;
        teamAScore(scoreA);
    }

    public void addFreeThrowtoTeamA(View view){
        scoreA = scoreA + 1;
        teamAScore(scoreA);
    }

    public void teamBScore(int score){
        scoreViewB.setText(String.valueOf(score));
    }

    public void addThreePointstoTeamB(View view){
        scoreB = scoreB + 3;
        teamBScore(scoreB);
    }

    public void addTwoPointstoTeamB(View view){
        scoreB = scoreB + 2;
        teamBScore(scoreB);
    }

    public void addFreeThrowtoTeamB(View view){
        scoreB = scoreB + 1;
        teamBScore(scoreB);
    }

    public void resetScore(View view){
        scoreA = 0;
        scoreB = 0;
        teamAScore(scoreA);
        teamBScore(scoreB);
    }
}
