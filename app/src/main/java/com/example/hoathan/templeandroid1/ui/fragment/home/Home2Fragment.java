package com.example.hoathan.templeandroid1.ui.fragment.home;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hoathan.templeandroid.R;
import com.example.hoathan.templeandroid1.ui.BaseFragment;
import com.example.hoathan.templeandroid1.ui.activity.MainActivity;
import com.example.hoathan.templeandroid1.ui.fragment.settings.Setting1Fragment;


public class Home2Fragment extends BaseFragment implements View.OnClickListener {
    private TextView tvAcc;
    private TextView tvPass;
    private Button btGotoSetting;
    MainActivity mainActivity;

    @Override
    protected int setLayout() {
        return R.layout.fragment_home_2;
    }

    @Override
    protected void initialViews(View view, Bundle bundle) {
        tvAcc = (TextView) view.findViewById(R.id.tvAcc);
        tvPass = (TextView) view.findViewById(R.id.tvPass);
        btGotoSetting = (Button) view.findViewById(R.id.btGotoSetting);

        mainActivity = (MainActivity) getActivity();

        if (bundle != null) {
            String acc = bundle.getString("Acc");
            String pass = bundle.getString("Pass");

            if (acc != null) {
                tvAcc.setText(acc);
            }
            if (pass != null) {
                tvPass.setText(pass);
            }
        }

        btGotoSetting.setOnClickListener(this);


    }

    @Override
    protected void initialVariables() {

    }

    @Override
    public void onClick(View v) {
        // muon nhay sang tab 2 va fragmennt 2 cua tab3


        final Bundle bundle = new Bundle();
        bundle.putString("Acc", tvAcc.getText().toString().trim());

        tvAcc.postDelayed(new Runnable() {
            @Override
            public void run() {
                mainActivity.switchTab(2);
                //baseActivity.setCurrentTab(BaseActivity.TITLE_SETTINGS);
                baseActivity.pushFragment(new Setting1Fragment(), true,bundle);
            }
        }, 300);
    }
}
