package com.example.hoathan.templeandroid1.ui.fragment.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.example.hoathan.templeandroid.R;
import com.example.hoathan.templeandroid1.ui.BaseFragment;

/**
 * Created by TuanAnh on 16-Sep-17.
 */

public class HomeFragment extends BaseFragment implements View.OnClickListener {
    private Button btKickHome,btnNextViewPager,btnNextViewPagerDemo;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    protected int setLayout() {
        return R.layout.fragment_home;

    }

    @Override
    protected void initialViews(View view, Bundle bundle) {
        btKickHome = (Button) view.findViewById(R.id.btn_NextFragment);
        btnNextViewPager = (Button) view.findViewById(R.id.btn_nextViewPager);
        btnNextViewPagerDemo = (Button) view.findViewById(R.id.btn_nextViewPagerDemo);
       btKickHome.setOnClickListener(this);
        btnNextViewPager.setOnClickListener(this);
        btnNextViewPagerDemo.setOnClickListener(this);

    }

    @Override
    protected void initialVariables() {

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_NextFragment:
                baseActivity.setCurrentTab(baseActivity.TITLE_HOME);
                baseActivity.pushFragment(new Home1Fragment(), true);
                break;
            case R.id.btn_nextViewPager:
                baseActivity.setCurrentTab(baseActivity.TITLE_HOME);
                baseActivity.pushFragment(new HomeViewPagerImageFragment(), true);
                break;
            case R.id.btn_nextViewPagerDemo:
                baseActivity.setCurrentTab(baseActivity.TITLE_HOME);
                baseActivity.pushFragment(new HomeViewPagerDemo(), true);
                break;
        }

    }


}
