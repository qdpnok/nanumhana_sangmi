package com.example.nanumhana_login_mypage_v0;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class CASignupSubActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ca_signup_sub_page);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        CheckBox checkAgree=findViewById(R.id.agreeCB);
        Button swcButton=findViewById(R.id.swcB);
        Button fpoButton=findViewById(R.id.fpoB);

        swcButton.setOnClickListener((view) -> {
            if(swcButton.isSelected()) {
                swcButton.setSelected(false); }
            else {
                swcButton.setSelected(true);
                fpoButton.setSelected(false); }
        });

        fpoButton.setOnClickListener((view)-> {
            if(fpoButton.isSelected()) {
                fpoButton.setSelected(false); }
            else {
                fpoButton.setSelected(true);
                swcButton.setSelected(false); }
        });

        Button moveCASignupPage=findViewById(R.id.movesignupB);
        moveCASignupPage.setOnClickListener((view) -> {
            if(swcButton.isSelected() || fpoButton.isSelected() && checkAgree.isChecked()) {
                Intent intent = new Intent(getApplicationContext(), CASignupSubActivity.class);
                startActivity(intent);
            }
        });

    }
}
