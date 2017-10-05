package com.example.hoathan.templeandroid1.ui.fragment.home;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.hoathan.templeandroid.R;
import com.example.hoathan.templeandroid1.interfacef.HandlerButton;

/**
 * A simple {@link Fragment} subclass.
 */
public class Step1Fragment extends Fragment {
    private HandlerButton handlerButton;
    private Button btnNext;

    private View view;


    public Step1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_step1, container, false);
        initView();
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((HomeViewPagerDemo)getParentFragment()).setCurrentTab(1);
            }
        });
        return view;
    }
    private void initView() {
        btnNext = (Button) view.findViewById(R.id.btn_next);

    }
    /*@Override
    public void onAttach(Context context) {
        super.onAttach(context);
        handlerButton = (HandlerButton) context;
    }*/
}
