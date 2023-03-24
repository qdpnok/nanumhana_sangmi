package com.example.nanumhana_login_mypage_v0;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class MembertypeActivity extends  AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.membertype_page);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Button movePCSignupPage=findViewById(R.id.personalB);
        movePCSignupPage.setOnClickListener((view -> {
            Intent intent = new Intent(getApplicationContext(), PCSignupSubActivity.class);
            startActivity(intent);
        }));

        Button moveCASignupPage=findViewById(R.id.enterpriseB);
        moveCASignupPage.setOnClickListener((view -> {
            Intent intent = new Intent(getApplicationContext(), CASignupSubActivity.class);
            startActivity(intent);
        }));
    }
}
