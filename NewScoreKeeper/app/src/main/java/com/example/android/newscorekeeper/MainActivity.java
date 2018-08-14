package com.example.android.newscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Integer values for points and fouls scoring
     */
    int pointsTeamA = 0;
    int foulsteamA = 0;
    int pointsteamB = 0;
    int foulsteamB = 0;

    /**
     * displays points for team A and B
     *
     */
    public void displaypointsA(int score) {
        TextView scoreView = findViewById(R.id.teamA_points);
        scoreView.setText(String.valueOf(score));
    }

    public void displaypointsB(int score) {
        TextView scoreView = findViewById(R.id.teamB_points);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *
     * displays fouls for team A aand B
     */

    public void displayfoulsA(int score) {
        TextView foulView = findViewById(R.id.teamA_fouls);
        foulView.setText(String.valueOf(score));
    }

    public void displayfoulsB(int score) {
        TextView foulView = findViewById(R.id.teamB_fouls);
        foulView.setText(String.valueOf(score));
    }

    /**
     * Display number of points for team A
     * @param view the Textview for team A points
     */
    public void teamA_points(View view) {
       pointsTeamA++;
       displaypointsA(pointsTeamA);
    }

    /**
     * Display number of fouls for team A
     * @param view the Textview for team A fouls
     */
    public void teamA_fouls(View view) {
        foulsteamA++;
        displayfoulsA(foulsteamA);
    }

    /**
     * Display number of points for team B
     * @param view the Textview for team B points
     */
    public void teamB_points(View view) {
        pointsteamB++;
        displaypointsB(pointsteamB);
    }

    /**
     * Display number of fouls for team B
     * @param view the Textview for team B fouls
     */
    public void teamB_fouls(View view) {
        foulsteamB++;
        displayfoulsB(foulsteamB);
    }

    /**
     * resets the scores of the game
     */
    public void resetScores(View view) {
        int reset = 0;
        pointsTeamA = pointsteamB = foulsteamA = foulsteamB = reset;
        displaypointsA(reset);
        displaypointsB(reset);
        displayfoulsA(reset);
        displayfoulsB(reset);
    }

}
