package com.example.nanumhana_login_mypage_v0;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_page);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Button moveLoginPage=findViewById(R.id.startB);
        moveLoginPage.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), LoginPageActivity.class);
            startActivity(intent);
        });
    }


}