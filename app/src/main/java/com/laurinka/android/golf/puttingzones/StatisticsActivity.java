package com.laurinka.android.golf.puttingzones;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Locale;

/**
 * Shows statistics.
 */
public class StatisticsActivity extends Activity {
    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statistics);
        prefs = getSharedPreferences(Constants.DATA.getString(), MODE_PRIVATE);

        fillTextView(Constants.ZONE0, R.id.textView0);
        fillTextView(Constants.ZONE1, R.id.textView1);
        fillTextView(Constants.ZONE2, R.id.textView2);
        fillTextView(Constants.ZONE3, R.id.textView3);
        fillTextView(Constants.ZONE4, R.id.textView4);
        fillTextView(Constants.ZONE5, R.id.textView5);
        fillTextView(Constants.ZONE5, R.id.textView6);
    }

    private void fillTextView(Constants key, int textView0) {
        int string = prefs.getInt(key.getString(), 0);
        Log.d("CRUD", "getting " + key.getString() + " " + textView0);
        ((TextView) findViewById(textView0)).setText(String.format(Locale.ENGLISH, "%d", string));
    }
}
