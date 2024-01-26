package com.example.ejercicio4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabs = findViewById(R.id.tabs);
        ViewPager2 viewPager = findViewById(R.id.pager);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager(),
                getLifecycle());
        viewPager.setAdapter(sectionsPagerAdapter);
        new TabLayoutMediator(tabs, viewPager, (tab, position) -> {
            tab.setText("TAB " + (position + 1));
        }).attach();
    }
}