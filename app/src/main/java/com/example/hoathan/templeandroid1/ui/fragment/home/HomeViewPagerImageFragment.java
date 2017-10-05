package com.example.hoathan.templeandroid1.ui.fragment.home;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Toast;

import com.example.hoathan.templeandroid.R;
import com.example.hoathan.templeandroid1.adapter.SmileAdapter;
import com.example.hoathan.templeandroid1.interfacef.CilckViewPageHinhAnh;
import com.example.hoathan.templeandroid1.model.Face;
import com.example.hoathan.templeandroid1.ui.BaseFragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeViewPagerImageFragment extends BaseFragment {
    private ViewPager vpSmile;
    private ArrayList<Face> arrayListFace;
    private SmileAdapter adapter;


    @Override
    protected int setLayout() {
        return R.layout.fragment_home_view_pager_image;
    }

    @Override
    protected void initialViews(View view, Bundle bundle) {
        arrayListFace = new ArrayList<>();
        arrayListFace.add(new Face("#FFFFFF00",R.drawable.logo,"logo"));
        arrayListFace.add(new Face("#FFD2D25A",R.drawable.mourinho,"mourinho"));
        arrayListFace.add(new Face("#FF1ACFBD",R.drawable.pepguardiola,"pepguardiola"));
        arrayListFace.add(new Face("#FF1ACFBD",R.drawable.pepguardiola,"pepguardiola"));
        arrayListFace.add(new Face("#FF1ACFBD",R.drawable.pepguardiola,"pepguardiola"));
        vpSmile = (ViewPager) view.findViewById(R.id.vp_smile);
        adapter = new SmileAdapter(getActivity(), arrayListFace, new CilckViewPageHinhAnh() {
            @Override
            public void clickHinhAnh(int position) {

                Toast.makeText(getActivity(), arrayListFace.get(position).getmFaceName(), Toast.LENGTH_SHORT).show();
            }
        });
        vpSmile.setAdapter(adapter);
    }

    @Override
    protected void initialVariables() {

    }

}
