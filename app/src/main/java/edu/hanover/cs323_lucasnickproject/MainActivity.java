package edu.hanover.cs323_lucasnickproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickGuessNumber(View view) {
        Spinner spin = (Spinner) findViewById(R.id.spin);
        String spinOdds = String.valueOf(spin.getSelectedItem());
        Intent intent = new Intent(this, GuessActivity.class);
        intent.putExtra("odds", spinOdds);
        startActivity(intent);
    }
}
