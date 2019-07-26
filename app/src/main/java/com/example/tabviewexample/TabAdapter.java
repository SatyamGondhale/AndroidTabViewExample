package com.example.tabviewexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabAdapter extends FragmentStatePagerAdapter {
    int noOfTabs;
    public TabAdapter(FragmentManager fm,int noOfTabs) {
        super(fm);
        this.noOfTabs=noOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new TabOne();
            case 1:
                return new TabTwo();
            case 2:
                return new TabThree();
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}
