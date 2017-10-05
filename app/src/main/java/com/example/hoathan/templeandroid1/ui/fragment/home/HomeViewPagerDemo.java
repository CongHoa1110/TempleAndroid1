package com.example.hoathan.templeandroid1.ui.fragment.home;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.example.hoathan.templeandroid.R;
import com.example.hoathan.templeandroid1.adapter.StepAdapter;
import com.example.hoathan.templeandroid1.interfacef.HandlerButton;
import com.example.hoathan.templeandroid1.ui.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeViewPagerDemo extends BaseFragment implements HandlerButton {

    private ViewPager viewPager;
    private PagerTabStrip pagerTabStrip;

    @Override
    protected int setLayout() {
        return R.layout.fragment_home_view_pager_demo;
    }

    @Override
    protected void initialViews(View view, Bundle bundle) {
        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        pagerTabStrip = (PagerTabStrip) view.findViewById(R.id.tab_layout);
        pagerTabStrip.setTextColor(getResources().getColor(R.color.whie));
        pagerTabStrip.setTabIndicatorColor(getResources().getColor(R.color.colorAccent));
        pagerTabStrip.setTextSize(2,14f);
        StepAdapter adapter_viewPagerFragment =new StepAdapter(getChildFragmentManager(),3);
        viewPager.setAdapter(adapter_viewPagerFragment);
        viewPager.setOffscreenPageLimit(3);//số lượng page lưu vào bộ nhớ cache để tránh tình trạng load lại
    }

    @Override
    protected void initialVariables() {

    }

    @Override
    public void chand(int position) {
        viewPager.setCurrentItem(position);
    }
    public void setCurrentTab(int position){
        viewPager.setCurrentItem(position);
    }
}
