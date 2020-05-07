package com.example.viewpagerandtablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager_view);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_tabLayout_view);

        SimpleViewPager sp = new SimpleViewPager(getSupportFragmentManager());

        viewPager.setAdapter(sp);

        tabLayout.setupWithViewPager(viewPager);
    }
}
