package com.example.hoathan.templeandroid1.ui.fragment.settings;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hoathan.templeandroid.R;
import com.example.hoathan.templeandroid1.ui.BaseActivity;
import com.example.hoathan.templeandroid1.ui.BaseFragment;

/**
 * Created by TuanAnh on 24-Sep-17.
 */

public class Setting1Fragment extends BaseFragment implements View.OnClickListener {
    private Button btSetting1;
    private TextView txvThongTin;

    @Override
    protected int setLayout() {
        return R.layout.fragment_setting_1;
    }

    @Override
    protected void initialViews(View view, Bundle bundle) {
        btSetting1 = (Button) view.findViewById(R.id.btSetting1);
        txvThongTin = (TextView) view.findViewById(R.id.txv_thongtinsetting2);
        btSetting1.setOnClickListener(this);
        if (bundle != null){
            String thongTinLay = bundle.getString("Acc");
            txvThongTin.setText(thongTinLay);
        }

    }

    @Override
    protected void initialVariables() {

    }

    @Override
    public void onClick(View v) {
        baseActivity.setCurrentTab(BaseActivity.TITLE_SETTINGS);
        baseActivity.pushFragment(new Setting2Fragment(), true);
    }
}
