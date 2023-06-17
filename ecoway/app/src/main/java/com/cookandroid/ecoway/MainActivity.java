package com.cookandroid.ecoway;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager=getSupportFragmentManager();
    private HomeActivity fragmentHome = new HomeActivity();
    private CounCamActivity fragmentCampaign = new CounCamActivity();
    private plusMenuActivity fragmentMypage = new plusMenuActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.containers, fragmentHome).commitAllowingStateLoss();
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new ItemSelectedListener());
    }

    class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener{
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem){
            FragmentTransaction transaction=fragmentManager.beginTransaction();

            switch (menuItem.getItemId()){
                case R.id.home:
                    transaction.replace(R.id.containers,fragmentHome).commitAllowingStateLoss();
                    break;
                case R.id.eco:
                    transaction.replace(R.id.containers,fragmentCampaign).commitAllowingStateLoss();
                    break;
                case R.id.user:
                    transaction.replace(R.id.containers,fragmentMypage).commitAllowingStateLoss();
                    break;
            }
            return true;
        }
    }

}