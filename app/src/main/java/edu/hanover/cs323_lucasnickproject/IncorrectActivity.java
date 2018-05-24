package edu.hanover.cs323_lucasnickproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IncorrectActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incorrect);
        String randNum = getIntent().getExtras().getString("randNum");
        String guess = getIntent().getExtras().getString("guess");
        TextView randNumT = (TextView) findViewById(R.id.textView6);
        TextView guessT = (TextView) findViewById(R.id.textView7);
        randNumT.setText("Result: " + randNum);
        guessT.setText("Your Guess: " + guess);
    }

    public void onClickMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
