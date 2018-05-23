package edu.hanover.cs323_lucasnickproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindNumber(View view) {
        TextView myNumber = (TextView) findViewById(R.id.myNumber);
        Spinner number = (Spinner) findViewById(R.id.number);
    }
}
