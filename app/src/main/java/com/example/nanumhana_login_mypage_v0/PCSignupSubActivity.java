package com.example.nanumhana_login_mypage_v0;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class PCSignupSubActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pc_signup_sub_page);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Button select14ormore=findViewById(R.id.up14B);
        select14ormore.setOnClickListener((view -> {
            if(select14ormore.isSelected()) {
                select14ormore.setSelected(false); }
            else {
                select14ormore.setSelected(true); }
        }));

        CheckBox checkAgree=findViewById(R.id.agreeCB);

        Button movePCSignupPage=findViewById(R.id.movesignupB);
        movePCSignupPage.setOnClickListener((view -> {
            if(select14ormore.isSelected() && checkAgree.isChecked()) {
                Intent intent = new Intent(getApplicationContext(), PCSignupActivity.class);
                startActivity(intent);
            }
        }));


    }
}
