package com.example.yinyun.mysplashdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setBackgroundDrawable(null);
        super.onCreate(savedInstanceState);
        View startView = View.inflate(this, R.layout.activity_splash, null);
        setContentView(startView);

        //渐变
        final AlphaAnimation aa = new AlphaAnimation(1f, 1.0f);
        aa.setDuration(1500);
        startView.setAnimation(aa);
        aa.setFillAfter(true);
        aa.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
