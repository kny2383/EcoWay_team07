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

public class ReCamActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        ActionBar actionBar = getSupportActionBar(); // 액션바 없애기
        actionBar.hide(); // 액션바 없애기

        super.onCreate(savedInstanceState);
        setContentView(R.layout.regcampign);
    }
}
