package com.example.user.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Handler;



public class SplashActivity extends AppCompatActivity {
        private static final int SPLASH_DISPLAY_LENGTH=3000;
    @Override

    public void setContentView(View view) {
        super.setContentView(view);
        setContentView(R.layout.love);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();
            }
        } ,SPLASH_DISPLAY_LENGTH);


    }
}
