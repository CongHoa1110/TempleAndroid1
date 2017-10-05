package com.example.hoathan.templeandroid1.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.hoathan.templeandroid1.ui.fragment.news.fragment.InformationFragment;
import com.example.hoathan.templeandroid1.ui.fragment.news.fragment.JobFragment;
import com.example.hoathan.templeandroid1.ui.fragment.news.fragment.MessageFragment;
import com.example.hoathan.templeandroid1.ui.fragment.news.fragment.NotificationFragment;
import com.example.hoathan.templeandroid1.ui.fragment.news.fragment.PlaceFragment;
import com.example.hoathan.templeandroid1.views.TabCustom;

/**
 * Created by Tungnguyenbk54 on 10/5/2017.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    private TabCustom mTabCustom;


    public TabCustom getmTabCustom() {
        return mTabCustom;
    }

    public void setmTabCustom(TabCustom mTabCustom) {
        this.mTabCustom = mTabCustom;
    }

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return JobFragment.newInstance(mTabCustom);
            case 1:
                return PlaceFragment.newInstance();
            case 2:
                return NotificationFragment.newInstance();
            case 3:
                return MessageFragment.newInstance();
            case 4:
                return InformationFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
