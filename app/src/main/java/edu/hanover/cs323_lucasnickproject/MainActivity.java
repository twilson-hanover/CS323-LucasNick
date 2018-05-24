package edu.hanover.cs323_lucasnickproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends Activity {
    private NumberGenerator generator = new NumberGenerator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickGuessNumber(View view) {
        TextView myNumber = (TextView) findViewById(R.id.myNumber);
        Spinner spin = (Spinner) findViewById(R.id.spin);
        Intent intent = new Intent(this, GuessActivity.class);
        startActivity(intent);
    }
}
