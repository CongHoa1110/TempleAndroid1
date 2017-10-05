package com.example.hoathan.templeandroid1.ui.fragment.home;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.hoathan.templeandroid.R;
import com.example.hoathan.templeandroid1.ui.BaseActivity;
import com.example.hoathan.templeandroid1.ui.BaseFragment;

/**
 * Created by TuanAnh on 24-Sep-17.
 */

public class Home1Fragment extends BaseFragment implements View.OnClickListener {
    private Button btKick2;
    private EditText edAcc;
    private EditText edPass;


    @Override
    protected int setLayout() {
        return R.layout.fragment_home_1;
    }

    @Override
    protected void initialViews(View view, Bundle bundle) {
        btKick2 = (Button) view.findViewById(R.id.btKick2);
        btKick2.setOnClickListener(this);

        edAcc = (EditText) view.findViewById(R.id.edAcc);
        edPass = (EditText) view.findViewById(R.id.edPass);
    }

    @Override
    protected void initialVariables() {

    }

    @Override
    public void onClick(View v) {
        baseActivity.setCurrentTab(BaseActivity.TITLE_HOME);


        String acc = edAcc.getText().toString().trim();
        String pass = edPass.getText().toString().trim();

        Bundle bundle = new Bundle();
        bundle.putString("Acc", acc);
        bundle.putString("Pass", pass);
        baseActivity.pushFragment(new Home2Fragment(), true,bundle);

    }
}
