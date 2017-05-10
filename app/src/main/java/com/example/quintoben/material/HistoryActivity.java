package com.example.quintoben.material;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    //tab
    private TabLayout tabLayout;
    //show history records
    private ViewPager pager;
    private List<String> tabName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        initViews();
        initTabName();
        //set Adapter
        pager.setAdapter(new HistoryFragmentAdapter(getSupportFragmentManager(),tabName));
        //bind Tab and ViewPager
        tabLayout.setupWithViewPager(pager);
        tabLayout.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
    }

    //init the tab name
    private void initTabName() {
        tabName = new ArrayList<String>();
        tabName.add("Past");
        tabName.add("Upcoming");

    }

    //init view
    private void initViews() {
        this.pager = (ViewPager) findViewById(R.id.view_pager);
        this.tabLayout = (TabLayout) findViewById(R.id.tab);
    }
}
