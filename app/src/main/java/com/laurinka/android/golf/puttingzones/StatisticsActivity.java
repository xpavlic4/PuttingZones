package com.laurinka.android.golf.puttingzones;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Shows statistics.
 */
public class StatisticsActivity extends Activity {
    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statistics);
        prefs = getSharedPreferences(Constants.DATA, MODE_PRIVATE);

        fillTextView("0", R.id.textView0);
        fillTextView("1", R.id.textView1);
        fillTextView("2", R.id.textView2);
        fillTextView("3", R.id.textView3);
        fillTextView("4", R.id.textView4);
        fillTextView("5", R.id.textView5);
    }

    private void fillTextView(String key, int textView0) {
        ((TextView) findViewById(textView0)).setText(prefs.getString(key, "0"));
    }
}
