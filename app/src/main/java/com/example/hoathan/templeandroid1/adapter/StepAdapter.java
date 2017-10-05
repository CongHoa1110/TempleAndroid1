package com.example.hoathan.templeandroid1.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.hoathan.templeandroid1.ui.fragment.home.Step1Fragment;
import com.example.hoathan.templeandroid1.ui.fragment.home.Step2Fragment;
import com.example.hoathan.templeandroid1.ui.fragment.home.Step3Fragment;

/**
 * Created by Tungnguyenbk54 on 9/20/2017.
 */

public class StepAdapter extends FragmentStatePagerAdapter {

    private int page_num;

    public StepAdapter(FragmentManager fm, int page_num) {
        super(fm);
        this.page_num = page_num;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new Step1Fragment();
                break;
            case 1:
                fragment = new Step2Fragment();
                break;
            case 2:
                fragment = new Step3Fragment();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return page_num;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return "Step " + ++position;
    }
}
