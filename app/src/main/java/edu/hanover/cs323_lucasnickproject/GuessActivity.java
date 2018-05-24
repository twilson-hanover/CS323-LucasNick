package edu.hanover.cs323_lucasnickproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.content.Intent;
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
            Intent intent = new Intent(this, CorrectActivity.class);
            intent.putExtra("randNum", randNum);
            intent.putExtra("guess", guess);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(this, IncorrectActivity.class);
            intent.putExtra("randNum", randNum);
            intent.putExtra("guess", guess);
            startActivity(intent);
        }
    }
}
