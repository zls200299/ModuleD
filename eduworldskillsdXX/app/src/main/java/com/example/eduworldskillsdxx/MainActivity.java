package com.example.eduworldskillsdxx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = findViewById(R.id.tab);
        TabAdapter tabAdapter = new TabAdapter(getSupportFragmentManager(),getLifecycle());
        ViewPager2 viewPager2 = findViewById(R.id.viewPager2);
        viewPager2.setAdapter(tabAdapter);
        new TabLayoutMediator(tabLayout,viewPager2,(tab,position)->{
            if(position == 0 ){
                tab.setText("注册");
            } else if (position== 1) {
                tab.setText("登陆");
            }
        }).attach();
        Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager2.setCurrentItem(1);
            }
        });
    }
}