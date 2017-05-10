package com.example.quintoben.material;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by quintoben on 5/7/17.
 */

public class HistoryFragmentAdapter extends FragmentPagerAdapter {

    private List<String> tabName;

    public HistoryFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    public HistoryFragmentAdapter(FragmentManager fm, List<String> list) {
        super(fm);
        this.tabName=list;
    }

    @Override
    public Fragment getItem(int position) {
        return new HistoryFragment();
    }

    @Override
    public int getCount() {
        return tabName.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabName.get(position);
    }
}
