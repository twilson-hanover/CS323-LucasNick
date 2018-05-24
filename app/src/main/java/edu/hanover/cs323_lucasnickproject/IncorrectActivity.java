package edu.hanover.cs323_lucasnickproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class IncorrectActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incorrect);
        String randNum = (getIntent().getExtras().getString("randNum"));
        String guess = (getIntent().getExtras().getString("guess"));
        TextView randNumT = (TextView) findViewById(R.id.textView6);
        TextView guessT = (TextView) findViewById(R.id.textView7);
        randNumT.setText("Result: " + randNum);
        guessT.setText("Your Guess: " + guess);
    }

    public void onClickMainActivity(View view) {
        String text = "Maybe next time!";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(this, text, duration);
        toast.show();Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
