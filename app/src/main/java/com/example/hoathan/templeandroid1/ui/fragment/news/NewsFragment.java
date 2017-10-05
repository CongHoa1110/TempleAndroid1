package com.example.hoathan.templeandroid1.ui.fragment.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hoathan.templeandroid.R;
import com.example.hoathan.templeandroid1.ui.BaseActivity;
import com.example.hoathan.templeandroid1.ui.BaseFragment;

/**
 * Created by TuanAnh on 16-Sep-17.
 */

public class NewsFragment extends BaseFragment implements View.OnClickListener {
    private Button btGo1;
    private TextView tvOutput;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int setLayout() {
        return R.layout.fragment_news;
    }

    @Override
    protected void initialViews(View view, Bundle bundle) {
        btGo1 = (Button) view.findViewById(R.id.btGo1);
        btGo1.setOnClickListener(this);

        tvOutput = (TextView) view.findViewById(R.id.tvOutput);

        if (bundle != null) {
            String output = bundle.getString("Input");
            tvOutput.setText(output);
        }
    }

    @Override
    protected void initialVariables() {

    }

    @Override
    public void onClick(View v) {
        baseActivity.setCurrentTab(BaseActivity.TITLE_NEWS);
        baseActivity.pushFragment(new New1Fragment(), true);
    }
}
