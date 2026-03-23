package com.example.motorsportpolyfanapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LandingPage extends AppCompatActivity {

    Button loginBtn, signupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);

        loginBtn = findViewById(R.id.loginBtn);
        signupBtn = findViewById(R.id.signupBtn);

        loginBtn.setOnClickListener(v -> {
            startActivity(new Intent(LandingPage.this, LoginPage.class));
        });

        signupBtn.setOnClickListener(v -> {
            startActivity(new Intent(LandingPage.this, LoginPage.class));
        });
    }
}