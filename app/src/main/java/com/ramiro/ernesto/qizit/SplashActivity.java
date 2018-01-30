package com.ramiro.ernesto.qizit;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TextView myTitle = (TextView)findViewById(R.id.Title);
        TextView mySubtitle = (TextView)findViewById(R.id.Subtitle);
        ImageView myImage = (ImageView)findViewById(R.id.imageView);

//        getSupportActionBar().hide();

//        // sets a Pretty Custom Font
        Typeface myFont = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        mySubtitle.setTypeface(myFont);
//        mySubtitle.setTypeface(myFont);

        //implements and starts animation
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.fadein);
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.leftin);

        myImage.startAnimation(myanim);
        myTitle.startAnimation(myanim2);

        openApp(true);
    }



    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity
                        .this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }


    }

