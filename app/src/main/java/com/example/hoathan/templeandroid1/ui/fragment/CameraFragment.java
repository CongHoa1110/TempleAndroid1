package com.example.hoathan.templeandroid1.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;

import com.example.hoathan.templeandroid.R;
import com.example.hoathan.templeandroid1.ui.BaseFragment;
import com.example.hoathan.templeandroid1.ui.activity.MainActivity;
import com.example.hoathan.templeandroid1.ui.fragment.settings.Setting3Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class CameraFragment extends BaseFragment implements View.OnClickListener {

private MainActivity mainActivity;

    @Override
    protected int setLayout() {
        return R.layout.fragment_camera;
    }

    @Override
    protected void initialViews(View view, Bundle bundle) {
        Button btnNext = (Button) view.findViewById(R.id.btn_camera_next);
        btnNext.setOnClickListener(this);

    }

    @Override
    protected void initialVariables() {
        mainActivity = (MainActivity) getActivity();

    }

    @Override
    public void onClick(View view) {
        mainActivity.switchTab(2);
        baseActivity.setCurrentTab(baseActivity.TITLE_SETTINGS);
        baseActivity.pushFragment(new Setting3Fragment(),true);
    }
}
