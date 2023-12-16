package com.laurinka.android.golf.puttingzones;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void add(View view) {
        startActivity(new Intent(this, AddActivity.class));
    }

    public void showStats(View view) {
        startActivity(new Intent(this, StatisticsActivity.class));
    }

    public void close(View view) {
        finish();
    }
}
