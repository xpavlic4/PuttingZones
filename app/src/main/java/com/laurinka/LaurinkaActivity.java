package com.laurinka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import com.laurinka.android.golf.puttingzones.MainActivity;
import com.laurinka.android.golf.puttingzones.R;

/**
 * Activity shows logo of company and forward flow to intro
 */
public class LaurinkaActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.laurinka);

        Thread logo = new Thread(){
            public void run(){
                try{

                    int time = 0;

                    while(time<3500){
                        sleep(100);
                        time = time + 100;
                    }
                    Intent i = new Intent(LaurinkaActivity.this, MainActivity.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(i);

                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    finish();
                }
            }
        };

        logo.start();
    }
}
