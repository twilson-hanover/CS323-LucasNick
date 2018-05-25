package edu.hanover.cs323_lucasnickproject;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

import java.util.Random;

public class GuessActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);
    }

    public void onClickValidateGuess(View view) {
        EditText myGuess = (EditText) findViewById(R.id.myGuess);
        String value = myGuess.getText().toString();
        int guess = Integer.parseInt(value);
        int oddsInt = Integer.parseInt(getIntent().getExtras().getString("odds"));
        Random r = new Random();
        int randNum = r.nextInt(oddsInt)+1;
        if (guess == randNum) {
            String text = "You have won What are the Odds!";
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(this, text, duration);
            toast.show();
            Intent intent = new Intent(this, CorrectActivity.class);
            intent.putExtra("randNum", String.valueOf(randNum));
            intent.putExtra("guess", String.valueOf(guess));
            startActivity(intent);
        }
        else {
            String text = "Maybe next time!";
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(this, text, duration);
            toast.show();
            Intent intent = new Intent(this, IncorrectActivity.class);
            intent.putExtra("randNum", String.valueOf(randNum));
            intent.putExtra("guess", String.valueOf(guess));
            startActivity(intent);
        }
    }
}
