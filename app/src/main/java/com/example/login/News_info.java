package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class News_info extends AppCompatActivity {


    TabLayout tabLayout;
    TabItem mhome,mtechnology;
    PagerAdapter pagerAdapter;
    Toolbar ntoolbar;
    String api="f630712f3ab5452c83245323327122d9";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_info);
        ntoolbar=findViewById(R.id.toolbar);
        setSupportActionBar(ntoolbar);
        mhome=findViewById(R.id.home);

        mtechnology=findViewById(R.id.technology);

        ViewPager viewPager=findViewById(R.id.fragmentcontainer);
        tabLayout=findViewById(R.id.include);

        pagerAdapter=new com.example.login.PagerAdapter(getSupportFragmentManager(),4);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0 || tab.getPosition() == 1|| tab.getPosition()==2||tab.getPosition()==3 ){
                    pagerAdapter.notifyDataSetChanged();

                }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}