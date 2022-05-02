package com.kaibalya.quickbite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //to hide action bar in the splash screen
        getSupportActionBar().hide();

        //thread is used to do multiple things in an app at the same time.
        Thread thread  = new Thread(){
            public void run(){
                //exception handling
                try {
                    sleep(1500);   //delay in milli-seconds
                }catch (Exception e){
                    e.printStackTrace();  //mother of all exceptions
                }
                finally {
                    // intent is used to shift from one activity to another activity
                    Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };thread.start();
    }
}