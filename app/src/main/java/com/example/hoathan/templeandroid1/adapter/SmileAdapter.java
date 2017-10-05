package com.example.hoathan.templeandroid1.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.hoathan.templeandroid.R;
import com.example.hoathan.templeandroid1.interfacef.CilckViewPageHinhAnh;
import com.example.hoathan.templeandroid1.model.Face;

import java.util.ArrayList;

/**
 * Created by Tungnguyenbk54 on 10/5/2017.
 */

public class SmileAdapter extends android.support.v4.view.PagerAdapter {
    private CilckViewPageHinhAnh click;
    private ArrayList<Face> faceArrayList;
    private LayoutInflater inflater;

    public SmileAdapter(Context context, ArrayList<Face> faceArrayList,CilckViewPageHinhAnh click) {
        this.faceArrayList = faceArrayList;
        this.inflater = LayoutInflater.from(context);
        this.click = click;

    }

    @Override
    public int getCount() {
        return faceArrayList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        View view = inflater.inflate(R.layout.item_smile, container, false);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ln_container);
        ImageView imgFace = (ImageView) view.findViewById(R.id.img_smile);
        TextView txvFace = (TextView) view.findViewById(R.id.txv_smile);

        Face face = faceArrayList.get(position);
        linearLayout.setBackgroundColor(Color.parseColor(face.getmColo()));
        imgFace.setImageResource(face.getmFaceImage());
        txvFace.setText(face.getmFaceName());

        container.addView(view);
        imgFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click.clickHinhAnh(position);
            }
        });

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((View) object);
    }
}

