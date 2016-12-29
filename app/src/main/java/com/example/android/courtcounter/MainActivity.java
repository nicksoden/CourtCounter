package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int period1A = 0;
    int period2A = 0;
    int period3A = 0;
    int period4A = 0;
    int period1B = 0;
    int period2B = 0;
    int period3B = 0;
    int period4B = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*displayForTeamA(8);*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /*Team A   1st Period*/

    public void increment1A(View view) {
        period1A = period1A + 1;
        int scoreTeamA = period1A + period2A + period3A + period4A;
        displayTotalScoreA(scoreTeamA);
        displayScore1A(period1A);
    }

    public void decrement1A(View view) {
        period1A = period1A - 1;
        int scoreTeamA = period1A + period2A + period3A + period4A;
        displayTotalScoreA(scoreTeamA);
        displayScore1A(period1A);
    }

    private void displayScore1A(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.period1A_text_view);
        quantityTextView.setText("" + number);
    }

    /*Team A  2nd Period*/

    public void increment2A(View view) {
        period2A = period2A + 1;
        int scoreTeamA = period1A + period2A + period3A + period4A;
        displayTotalScoreA(scoreTeamA);
        displayScore2A(period2A);
    }

    public void decrement2A(View view) {
        period2A = period2A - 1;
        int scoreTeamA = period1A + period2A + period3A + period4A;
        displayTotalScoreA(scoreTeamA);
        displayScore2A(period2A);
    }

    private void displayScore2A(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.period2A_text_view);
        quantityTextView.setText("" + number);
    }

  /*Team A  3rd Period*/

    public void increment3A(View view) {
        period3A = period3A + 1;
        int scoreTeamA = period1A + period2A + period3A + period4A;
        displayTotalScoreA(scoreTeamA);
        displayScore3A(period3A);
    }

    public void decrement3A(View view) {
        period3A = period3A - 1;
        int scoreTeamA = period1A + period2A + period3A + period4A;
        displayTotalScoreA(scoreTeamA);
        displayScore3A(period3A);
    }

    private void displayScore3A(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.period3A_text_view);
        quantityTextView.setText("" + number);
    }

    /*Team A  OT */

    public void increment4A(View view) {
        period4A = period4A + 1;
        int scoreTeamA = period1A + period2A + period3A + period4A;
        displayTotalScoreA(scoreTeamA);
        displayScore4A(period4A);
    }

    public void decrement4A(View view) {
        period4A = period4A - 1;
        int scoreTeamA = period1A + period2A + period3A + period4A;
        displayTotalScoreA(scoreTeamA);
        displayScore4A(period4A);
    }

    private void displayScore4A(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.period4A_text_view);
        quantityTextView.setText("" + number);
    }



    public void displayTotalScoreA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreA_text_view);
        scoreView.setText(String.valueOf(score));
    }

/*Team B   1st Period*/

    public void increment1B(View view) {
        period1B = period1B + 1;
        int scoreTeamB = period1B + period2B + period3B + period4B;
        displayTotalScoreB(scoreTeamB);
        displayScore1B(period1B);
    }

    public void decrement1B(View view) {
        period1B = period1B - 1;
        int scoreTeamB = period1B + period2B + period3B + period4B;
        displayTotalScoreB(scoreTeamB);
        displayScore1B(period1B);
    }

    private void displayScore1B(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.period1B_text_view);
        quantityTextView.setText("" + number);
    }

    /*Team B  2nd Period*/

    public void increment2B(View view) {
        period2B = period2B + 1;
        int scoreTeamB = period1B + period2B + period3B + period4B;
        displayTotalScoreB(scoreTeamB);
        displayScore2B(period2B);
    }

    public void decrement2B(View view) {
        period2B = period2B - 1;
        int scoreTeamB = period1B + period2B + period3B + period4B;
        displayTotalScoreB(scoreTeamB);
        displayScore2B(period2B);
    }

    private void displayScore2B(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.period2B_text_view);
        quantityTextView.setText("" + number);
    }


  /*Team B  3rd Period*/

    public void increment3B(View view) {
        period3B = period3B + 1;
        int scoreTeamB = period1B + period2B + period3B + period4B;
        displayTotalScoreB(scoreTeamB);
        displayScore3B(period3B);
    }

    public void decrement3B(View view) {
        period3B = period3B - 1;
        int scoreTeamB = period1B + period2B + period3B + period4B;
        displayTotalScoreB(scoreTeamB);
        displayScore3B(period3B);
    }

    private void displayScore3B(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.period3B_text_view);
        quantityTextView.setText("" + number);
    }

    /*Team B  OT */

    public void increment4B(View view) {
        period4B = period4B + 1;
        int scoreTeamB = period1B + period2B + period3B + period4B;
        displayTotalScoreB(scoreTeamB);
        displayScore4B(period4B);
    }

    public void decrement4B(View view) {
        period4B = period4B - 1;
        int scoreTeamB = period1B + period2B + period3B + period4B;
        displayTotalScoreB(scoreTeamB);
        displayScore4B(period4B);
    }

    private void displayScore4B(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.period4B_text_view);
        quantityTextView.setText("" + number);
    }

    public void displayTotalScoreB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreB_text_view);
        scoreView.setText(String.valueOf(score));
    }

    public void resetAll(View v) {
        period1A = 0;
        period2A = 0;
        period3A = 0;
        period4A = 0;
        period1B = 0;
        period2B = 0;
        period3B = 0;
        period4B = 0;
        displayScore1A(period1A);
        displayScore1B(period1B);
        displayScore2A(period2A);
        displayScore2B(period2B);
        displayScore3A(period3A);
        displayScore3B(period3B);
        displayScore4A(period4A);
        displayScore4B(period4B);
        displayTotalScoreA(0);
        displayTotalScoreB(0);
    }
}
