package com.cookandroid.ecoway;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class recycSmallCategoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        ActionBar actionBar = getSupportActionBar(); // 액션바 없애기
        actionBar.hide(); // 액션바 없애기

        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_smallcategory);

        //벽지 버튼 -> 벽지 재활용 xml 연결
        Button wallpaperBtn=findViewById(R.id.reuse_button9);
        wallpaperBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(recycSmallCategoryActivity.this,recycDetailActivity.class);
                startActivity(intent);
            }
        });
    }
}