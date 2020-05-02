package com.example.drtravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.drtravel.LoginActivity.LoginActivity;

public class SplashScreen extends AppCompatActivity {
    private int waktu_loading=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent toLoginpage = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(toLoginpage);
                finish();
            }
        }, waktu_loading);
    }
}
