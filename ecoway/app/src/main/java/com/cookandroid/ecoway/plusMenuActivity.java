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

public class plusMenuActivity extends Fragment {

    public int flag =0;
    public View view;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(flag==0){
            view = inflater.inflate(R.layout.menu, container, false);

            Button loginButton = view.findViewById(R.id.login_button);
            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), LoginActivity.class);
                    getActivity().startActivity(intent);
                }
            });

            Button unSubscribeButton = view.findViewById(R.id.unsubscribe_btn);
            unSubscribeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), UnSubscribeActivity.class);
                    getActivity().startActivity(intent);
                }
            });

        }else if(flag==1){
            view = inflater.inflate(R.layout.home, container, false);
        }
        return view;
    }
}