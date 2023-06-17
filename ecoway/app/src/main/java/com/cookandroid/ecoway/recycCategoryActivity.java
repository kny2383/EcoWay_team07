package com.cookandroid.ecoway;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class recycCategoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        ActionBar actionBar = getSupportActionBar(); // 액션바 없애기
        actionBar.hide(); // 액션바 없애기

        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_category);

        Button funitureBtn = findViewById(R.id.reuse_button);
        funitureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(recycCategoryActivity.this, recycDetail1Activity.class);
                startActivity(intent);
            }
        });

        Button funitureBtn2 = findViewById(R.id.reuse_button2);
        funitureBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(recycCategoryActivity.this, recycDetail2Activity.class);
                startActivity(intent);
            }
        });

        Button funitureBtn3 = findViewById(R.id.reuse_button3);
        funitureBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(recycCategoryActivity.this, recycDetail3Activity.class);
                startActivity(intent);
            }
        });

        Button funitureBtn4 = findViewById(R.id.reuse_button4);
        funitureBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(recycCategoryActivity.this, recycDetail4Activity.class);
                startActivity(intent);
            }
        });
    }
}
