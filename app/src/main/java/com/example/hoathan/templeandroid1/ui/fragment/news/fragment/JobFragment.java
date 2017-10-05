package com.example.hoathan.templeandroid1.ui.fragment.news.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import com.example.hoathan.templeandroid.R;
import com.example.hoathan.templeandroid1.interfacef.JobTabControlListener;
import com.example.hoathan.templeandroid1.ui.BaseFragment;
import com.example.hoathan.templeandroid1.views.TabCustom;

/**
 * A simple {@link Fragment} subclass.
 */
public class JobFragment extends BaseFragment implements JobTabControlListener {
    private static TabCustom mTabCustom;
    public static JobFragment newInstance( TabCustom tabCustom) {
        JobFragment jobFragment = new JobFragment();
        mTabCustom = tabCustom;
        return jobFragment;

    }

    @Override
    protected int setLayout() {
        return R.layout.fragment_job;
    }

    @Override
    protected void initialViews(View view, Bundle bundle) {
        mTabCustom.setJobTabControlListener(this);
    }

    @Override
    protected void initialVariables() {

    }

    @Override
    public void onLoadTop() {

    }
}
