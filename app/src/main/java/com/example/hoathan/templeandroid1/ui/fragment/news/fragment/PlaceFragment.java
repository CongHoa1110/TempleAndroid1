package com.example.hoathan.templeandroid1.ui.fragment.news.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import com.example.hoathan.templeandroid.R;
import com.example.hoathan.templeandroid1.ui.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlaceFragment extends BaseFragment {

    public static PlaceFragment newInstance() {
        PlaceFragment placeFragment = new PlaceFragment();
        return placeFragment;
    }


    @Override
    protected int setLayout() {
        return R.layout.fragment_place;
    }

    @Override
    protected void initialViews(View view, Bundle bundle) {

    }

    @Override
    protected void initialVariables() {

    }

}
