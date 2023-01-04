package com.example.ucoe_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;

import com.airbnb.lottie.LottieAnimationView;


public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        Intent intent = new Intent(this , MainActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                startActivity(intent);
                finish();
            }
        },1500);
    }
}