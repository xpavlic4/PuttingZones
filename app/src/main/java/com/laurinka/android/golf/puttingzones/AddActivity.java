package com.laurinka.android.golf.puttingzones;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
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
        prefs = getSharedPreferences(Constants.DATA.getString(), MODE_PRIVATE);
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

    private void updateZone(Constants tmpDefinition) {
        String toUpdate = tmpDefinition.getString();
        int zone0 = prefs.getInt(toUpdate, 0);
        zone0 = zone0 + 1;
        Log.d("CRUD", "updateZone: " + toUpdate+" updated with " +zone0);
        prefs.edit().putInt(toUpdate, zone0).apply();
    }

}
