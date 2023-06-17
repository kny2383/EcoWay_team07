package com.cookandroid.ecoway;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.annotations.Nullable;

public class CounCamActivity extends Fragment {
    private final int Fragment_1 = 1;
    private final int Fragment_2 = 2;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        View v = inflater.inflate(R.layout.councampaign,container,false);

        Button funitureBtn= (Button)v.findViewById(R.id.campaignbtn);
        Button CambrandBtn=(Button)v.findViewById(R.id.cambrandbtn);
        funitureBtn.setSelected(true);
        CambrandBtn.setSelected(false);

        funitureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_1);
                funitureBtn.setSelected(true);
                CambrandBtn.setSelected(false);
            }
        });

        CambrandBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_2);
                funitureBtn.setSelected(false);
                CambrandBtn.setSelected(true);
            }
        });
        FragmentView(Fragment_1);

        return v;
    }

    private void FragmentView(int fragment){
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();

        switch (fragment){
            case 1:
                MainCampaignActivity fragment1= new MainCampaignActivity();
                transaction.replace(R.id.fragment_container2, fragment1);
                transaction.commit();
                break;

            case 2:
                CamBrandActivity fragment2 = new CamBrandActivity();
                transaction.replace(R.id.fragment_container2, fragment2);
                transaction.commit();
                break;
        }
    }
}