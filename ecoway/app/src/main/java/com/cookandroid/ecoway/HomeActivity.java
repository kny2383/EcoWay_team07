package com.cookandroid.ecoway;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeActivity extends Fragment {
    private final int Fragment_1 = 1;
    private final int Fragment_2 = 2;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        View v = inflater.inflate(R.layout.home,container,false);

        Button RecyclingBtn= (Button)v.findViewById(R.id.recyclingbtn);
        Button RebrandBtn=(Button)v.findViewById(R.id.rebrandbtn);
        RecyclingBtn.setSelected(true);
        RebrandBtn.setSelected(false);

        RecyclingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_1);
                RecyclingBtn.setSelected(true);
                RebrandBtn.setSelected(false);
            }
        });

        RebrandBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_2);
                RecyclingBtn.setSelected(false);
                RebrandBtn.setSelected(true);
            }
        });
        FragmentView(Fragment_1);

        return v;
    }

    private void FragmentView(int fragment){
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();

        switch (fragment){
            case 1:
                MainRecycleActivity fragment1 = new MainRecycleActivity();
                transaction.replace(R.id.fragment_container, fragment1);
                transaction.commit();
                break;

            case 2:
                ReBrandActivity fragment2 = new ReBrandActivity();
                transaction.replace(R.id.fragment_container, fragment2);
                transaction.commit();
                break;
        }
    }

}
