package com.example.user.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends Activity {
    ImageView mRocket;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        //안재성

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        mRocket = (ImageView) findViewById(R.id.rocket);




        Handler hd = new Handler();

        hd.postDelayed(new Runnable() {



            @Override

            public void run() {

                finish();

            }


        }, 2000);

    }
    @Override
    protected void onResume() {
        super.onResume();

        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);



        startRocketTweenAnimation();
        //안재성

    }

    private void startRocketTweenAnimation() {
        Animation rocket_anim = AnimationUtils.loadAnimation(this, R.anim.rocket);
        mRocket.startAnimation(rocket_anim);
    }


}
