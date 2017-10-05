package com.example.hoathan.templeandroid1.ui.fragment.news.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import com.example.hoathan.templeandroid.R;
import com.example.hoathan.templeandroid1.ui.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class MessageFragment extends BaseFragment {

    public static MessageFragment newInstance() {
        MessageFragment messageFragment = new MessageFragment();
        return messageFragment;
    }
    @Override
    protected int setLayout() {
        return R.layout.fragment_message;
    }

    @Override
    protected void initialViews(View view, Bundle bundle) {

    }

    @Override
    protected void initialVariables() {

    }
}
