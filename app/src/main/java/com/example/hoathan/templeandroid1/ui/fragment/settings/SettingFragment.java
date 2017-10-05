package com.example.hoathan.templeandroid1.ui.fragment.settings;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.hoathan.templeandroid.R;
import com.example.hoathan.templeandroid1.adapter.ListAAdapter;
import com.example.hoathan.templeandroid1.ui.BaseActivity;
import com.example.hoathan.templeandroid1.ui.BaseFragment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by TuanAnh on 16-Sep-17.
 */

public class SettingFragment extends BaseFragment implements View.OnClickListener {
    private Button btkick;
    private List<String> mList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private ListAAdapter aAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int setLayout() {
        return R.layout.fragment_settings;
    }

    @Override
    protected void initialViews(View view, Bundle bundle) {
        //btkick = (Button) view.findViewById(R.id.btkick);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        //btkick.setOnClickListener(this);
        fakeData();
        setUpRecyclerView();
    }

    @Override
    protected void initialVariables() {

    }

    @Override
    public void onClick(View v) {
        baseActivity.setCurrentTab(BaseActivity.TITLE_SETTINGS);
        baseActivity.pushFragment(new Setting1Fragment(), true);
    }
    private void fakeData() {
        Random random = new Random();
        for (int i = 0; i < 100; i++)
            mList.add(String.valueOf(random.nextInt(100)));
    }
    private void setUpRecyclerView() {
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(manager);
        aAdapter = new ListAAdapter(mList);
        mRecyclerView.setAdapter(aAdapter);
    }
}
