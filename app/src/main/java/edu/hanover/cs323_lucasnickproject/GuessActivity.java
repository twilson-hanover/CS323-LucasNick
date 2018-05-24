package edu.hanover.cs323_lucasnickproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

public class GuessActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);
    }

    public void onClickValidateGuess(View view, String number) {
        EditText myGuess = (EditText) findViewById(R.id.myGuess);
        if (number.equals("5")) {
            String value = myGuess.getText().toString();
            int guess = Integer.parseInt(value);
            if (guess < 1 || guess > 5) {
                // throw error and make them guess a different number
                String text = "Guess is out of range! Please guess again.";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(this, text, duration);
                toast.show();
            }
            else {
                //CorrectActivity or IncorrectActivity
            }
        }
        else if (number.equals("10")) {
            String value = myGuess.getText().toString();
            int guess = Integer.parseInt(value);
            if (guess < 1 || guess > 10) {
                // throw error and make them guess a different number
                String text = "Guess is out of range! Please guess again.";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(this, text, duration);
                toast.show();
            }
            else {
                //CorrectActivity or IncorrectActivity
            }
        }
        else if (number.equals("15")) {
            String value = myGuess.getText().toString();
            int guess = Integer.parseInt(value);
            if (guess < 1 || guess > 15) {
                // throw error and make them guess a different number
                String text = "Guess is out of range! Please guess again.";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(this, text, duration);
                toast.show();
            }
            else {
                //CorrectActivity or IncorrectActivity
            }
        }
        else if (number.equals("20")) {
            String value = myGuess.getText().toString();
            int guess = Integer.parseInt(value);
            if (guess < 1 || guess > 20) {
                // throw error and make them guess a different number
                String text = "Guess is out of range! Please guess again.";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(this, text, duration);
                toast.show();
            }
            else {
                //CorrectActivity or IncorrectActivity
            }
        }
        else if (number.equals("25")) {
            String value = myGuess.getText().toString();
            int guess = Integer.parseInt(value);
            if (guess < 1 || guess > 25) {
                // throw error and make them guess a different number
                String text = "Guess is out of range! Please guess again.";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(this, text, duration);
                toast.show();
            }
            else {
                //CorrectActivity or IncorrectActivity
            }
        }
        else if (number.equals("30")) {
            String value = myGuess.getText().toString();
            int guess = Integer.parseInt(value);
            if (guess < 1 || guess > 30) {
                // throw error and make them guess a different number
                String text = "Guess is out of range! Please guess again.";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(this, text, duration);
                toast.show();
            }
            else {
                //CorrectActivity or IncorrectActivity
            }
        }
        else if (number.equals("50")) {
            String value = myGuess.getText().toString();
            int guess = Integer.parseInt(value);
            if (guess < 1 || guess > 50) {
                // throw error and make them guess a different number
                String text = "Guess is out of range! Please guess again.";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(this, text, duration);
                toast.show();
            }
            else {
                //CorrectActivity or IncorrectActivity
            }
        }
        else if (number.equals("75")) {
            String value = myGuess.getText().toString();
            int guess = Integer.parseInt(value);
            if (guess < 1 || guess > 75) {
                // throw error and make them guess a different number
                String text = "Guess is out of range! Please guess again.";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(this, text, duration);
                toast.show();
            }
            else {
                //CorrectActivity or IncorrectActivity
            }
        }
        else {
            String value = myGuess.getText().toString();
            int guess = Integer.parseInt(value);
            if (guess < 1 || guess > 100) {
                // throw error and make them guess a different number
                String text = "Guess is out of range! Please guess again.";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(this, text, duration);
                toast.show();
            }
            else {
                //CorrectActivity or IncorrectActivity
            }
        }
    }
}
