package com.cookandroid.ecoway;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainRecycleActivity extends Fragment {

    int images[]={R.drawable.example_doll, R.drawable.example_doll, R.drawable.example_doll, R.drawable.example_doll, R.drawable.example_doll};


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        setHasOptionsMenu(true);
        ViewGroup v = (ViewGroup) inflater.inflate(R.layout.main_recycle, container, false);

        Button btn1 = (Button) v.findViewById(R.id.mainrecycle_btn1);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), recycDetail1Activity.class);
                startActivity(intent);
            }
        });

        Button btn2=(Button) v.findViewById(R.id.mainrecycle_btn2);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), recycDetail2Activity.class);
                startActivity(intent);
            }
        });

        Button btn3=(Button) v.findViewById(R.id.mainrecycle_btn3);
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), recycDetail3Activity.class);
                startActivity(intent);
            }
        });

        Button btn4=(Button) v.findViewById(R.id.mainrecycle_btn4);
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), recycDetail4Activity.class);
                startActivity(intent);
            }
        });

        Button btn5=(Button) v.findViewById(R.id.mainrecycle_btn5);
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), recycDetail5Activity.class);
                startActivity(intent);
            }
        });

        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }


}