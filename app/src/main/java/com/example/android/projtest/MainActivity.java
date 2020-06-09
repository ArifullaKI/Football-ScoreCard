package com.example.android.projtest;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int homescore = 0;
    int awayscore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
                /** display for home score*/
    public void displayHomeScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_score_text);
        scoreView.setText(String.valueOf(score));
    }

    /** display for away score*/
    public void displayAwayScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_score_text);
        scoreView.setText(String.valueOf(score));
    }

  public void homescore(View view)
  {
      homescore=homescore+1;
      displayHomeScore(homescore);
  }

    public void awayscore(View view)
    {
        awayscore++;
        displayAwayScore(awayscore);
    }

    public void reset(View view)
    {
        awayscore=0;
        homescore=0;
        displayAwayScore(awayscore);
        displayHomeScore(homescore);
    }


}
