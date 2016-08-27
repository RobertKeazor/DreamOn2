package com.androidsummit2016.dreamon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_splash_screen);

//        // METHOD 1
//
//        /******
//         * Create Thread that will sleep for 5 seconds
//         *************/
//        Thread background = new Thread() {
//            public void run() {
//
//                try {
//                    // Thread will sleep for 5 seconds
//                    sleep(5 * 1000);
//
//                    // After 5 seconds redirect to another intent
//                    Intent splashIntent = new Intent(getBaseContext(), MainActivity.class);
//                    startActivity(splashIntent);
//
//                    //Remove activity
//                    finish();
//
//                } catch (Exception e) {
//
//                }
//            }
//        };
//        // start thread
//        background.start();
//    }

//METHOD 2
        new Handler().postDelayed(new Runnable() {

            // Using handler with postDelayed called runnable run method

            @Override
            public void run() {
                Intent splashIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(splashIntent);

                // close this activity
                finish();
            }
        }, 5 * 1000); // wait for 5 seconds
    }

}