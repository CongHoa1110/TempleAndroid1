package com.example.hoathan.templeandroid1.ui.fragment.settings;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hoathan.templeandroid.R;
import com.example.hoathan.templeandroid1.ui.BaseFragment;

/**
 * Created by TuanAnh on 24-Sep-17.
 */

public class Setting2Fragment extends BaseFragment implements View.OnClickListener{
    @Override
    protected int setLayout() {
        return R.layout.fragment_setting_2;
    }

    @Override
    protected void initialViews(View view, Bundle bundle) {
        Button btnBack = (Button) view.findViewById(R.id.btn_backsetting);
        btnBack.setOnClickListener(this);
    }

    @Override
    protected void initialVariables() {

    }

    @Override
    public void onClick(View view) {
        baseActivity.popFragment();

    }
}
