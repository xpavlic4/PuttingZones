package com.laurinka.android.golf.puttingzones;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

/**
 * Activity backing main screen with putting zones
 * is performed.
 */
public class AddActivity extends Activity {
    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add);
        prefs = getSharedPreferences(Constants.DATA, MODE_PRIVATE);
    }

    public void add0(View view) {
        updateZone(Constants.ZONE0);
    }

    public void add1(View view) {
        updateZone(Constants.ZONE1);
    }

    public void add2(View view) {
        updateZone(Constants.ZONE2);
    }

    public void add3(View view) {
        updateZone(Constants.ZONE3);
    }

    public void add4(View view) {
        updateZone(Constants.ZONE4);
    }

    public void add5(View view) {
        updateZone(Constants.ZONE5);
    }

    private void updateZone(String zone01) {
        int zone0 = prefs.getInt(zone01, 0);
        prefs.edit().putInt(zone01, ++zone0).apply();
    }
}
