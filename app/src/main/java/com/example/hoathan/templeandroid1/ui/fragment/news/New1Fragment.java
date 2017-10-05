package com.example.hoathan.templeandroid1.ui.fragment.news;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.example.hoathan.templeandroid.R;
import com.example.hoathan.templeandroid1.adapter.PagerAdapter;
import com.example.hoathan.templeandroid1.ui.BaseFragment;
import com.example.hoathan.templeandroid1.views.TabCustom;

/**
 * Created by TuanAnh on 24-Sep-17.
 */

public class New1Fragment extends BaseFragment  {
    private PagerAdapter pagerAdapter;

    private ViewPager viewPager;
    private TabCustom tabCustom;

    @Override
    protected int setLayout() {
        return R.layout.fragment_new_1;
    }

    @Override
    protected void initialViews(View view, Bundle bundle) {
        viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        tabCustom = (TabCustom) view.findViewById(R.id.tab_custom);
        pagerAdapter = new PagerAdapter(getActivity().getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        pagerAdapter.setmTabCustom(tabCustom);
        tabCustom.setUpTabWithViewPager(viewPager);
        viewPager.setCurrentItem(0);
    }

    @Override
    protected void initialVariables() {

    }

}
