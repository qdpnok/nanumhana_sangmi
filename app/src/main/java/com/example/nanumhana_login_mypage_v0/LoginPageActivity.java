package com.example.nanumhana_login_mypage_v0;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class LoginPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Button moveMembertypePage=findViewById(R.id.jimB);
        moveMembertypePage.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MembertypeActivity.class);
            startActivity(intent);
        });
    }
}
