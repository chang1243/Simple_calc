package com.example.simple_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        Thread T = new Thread(){

            public void run() {
                try{
                    sleep(2000);

                }

                catch(Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent I = new Intent(Splash_activity.this , MainActivity.class);
                    startActivity(I);

                }


                }
        };T.start();

    }
}