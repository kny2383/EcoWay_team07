package com.cookandroid.ecoway;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SelCamActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        ActionBar actionBar = getSupportActionBar(); // 액션바 없애기
        actionBar.hide(); // 액션바 없애기

        super.onCreate(savedInstanceState);
        setContentView(R.layout.selcampaign);

        Button rebtn = findViewById(R.id.region_button); // 비밀번호 변경 버튼
        rebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelCamActivity.this, ReCamActivity.class); // 설명은 아래에.
                startActivity(intent);
            }
        });

        Button counbtn = findViewById(R.id.country_button); // 비밀번호 변경 버튼
        counbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelCamActivity.this, CounCamActivity.class); // 설명은 아래에.
                startActivity(intent);
            }
        });
    }


}
