package com.laurinka.android.golf.puttingzones;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        prefs = getSharedPreferences("data", MODE_PRIVATE);
    }

    public void add(View view) {
        //startActivity(new Intent(this, AddByActivity.class));
    }

    public void showStats(View view) {
    }

    public void close(View view) {
        finish();
    }
}
