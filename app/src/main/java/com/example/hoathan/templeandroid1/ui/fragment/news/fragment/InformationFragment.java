package com.example.hoathan.templeandroid1.ui.fragment.news.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import com.example.hoathan.templeandroid.R;
import com.example.hoathan.templeandroid1.ui.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class InformationFragment extends BaseFragment {


    public static InformationFragment newInstance() {
        InformationFragment informationFragment = new InformationFragment();
        return informationFragment;
    }
    @Override
    protected int setLayout() {
        return R.layout.fragment_information;
    }

    @Override
    protected void initialViews(View view, Bundle bundle) {

    }

    @Override
    protected void initialVariables() {

    }
}
