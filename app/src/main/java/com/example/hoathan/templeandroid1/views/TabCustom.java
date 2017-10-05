package com.example.hoathan.templeandroid1.views;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.hoathan.templeandroid.R;
import com.example.hoathan.templeandroid1.interfacef.JobTabControlListener;

/**
 * Created by Tungnguyenbk54 on 10/5/2017.
 */

public class TabCustom extends LinearLayout implements ViewPager.OnPageChangeListener {
    private JobTabControlListener jobTabControlListener;

    private ImageView ivJobTab;
    private ImageView ivPlaceTab;
    private ImageView ivNotificationTab;
    private ImageView ivMessageTab;
    private ImageView ivInformationTab;


    private int mainColor;
    private int extraColor;

    public TabCustom(Context context) {
        this(context, null);
    }

    public TabCustom(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TabCustom(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init();
    }

    private void init() {
        setOrientation(HORIZONTAL);
        LayoutInflater.from(getContext()).inflate(R.layout.layout_custom_tab, this);

        ivJobTab = (ImageView) findViewById(R.id.iv_job_tab);
        ivPlaceTab = (ImageView) findViewById(R.id.iv_place_tab);
        ivNotificationTab = (ImageView) findViewById(R.id.iv_notification_tab);
        ivMessageTab = (ImageView) findViewById(R.id.iv_message_tab);
        ivInformationTab = (ImageView) findViewById(R.id.iv_information_tab);


        mainColor = ContextCompat.getColor(getContext(), R.color.colorPrimary);
        extraColor = ContextCompat.getColor(getContext(), R.color.colorGray);
    }

    public void setUpTabWithViewPager(final ViewPager viewPager) {
        viewPager.addOnPageChangeListener(this);

        ivJobTab.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (viewPager.getCurrentItem() != 0) {
                    viewPager.setCurrentItem(0);
                }else {
                    jobTabControlListener.onLoadTop();
                }
            }
        });

        ivPlaceTab.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (viewPager.getCurrentItem() != 1) {
                    viewPager.setCurrentItem(1);
                }
            }
        });

        ivNotificationTab.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (viewPager.getCurrentItem() != 2) {
                    viewPager.setCurrentItem(2);
                }
            }
        });

        ivMessageTab.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (viewPager.getCurrentItem() != 3) {
                    viewPager.setCurrentItem(3);
                }
            }
        });

        ivInformationTab.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (viewPager.getCurrentItem() != 4) {
                    viewPager.setCurrentItem(4);
                }
            }
        });
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        switch (position) {
            case 0:
                ivJobTab.setColorFilter(mainColor);
                ivPlaceTab.setColorFilter(extraColor);
                ivNotificationTab.setColorFilter(extraColor);
                ivMessageTab.setColorFilter(extraColor);
                ivInformationTab.setColorFilter(extraColor);
                break;
            case 1:
                ivJobTab.setColorFilter(extraColor);
                ivPlaceTab.setColorFilter(mainColor);
                ivNotificationTab.setColorFilter(extraColor);
                ivMessageTab.setColorFilter(extraColor);
                ivInformationTab.setColorFilter(extraColor);
                break;
            case 2:
                ivJobTab.setColorFilter(extraColor);
                ivPlaceTab.setColorFilter(extraColor);
                ivNotificationTab.setColorFilter(mainColor);
                ivMessageTab.setColorFilter(extraColor);
                ivInformationTab.setColorFilter(extraColor);
                break;
            case 3:
                ivJobTab.setColorFilter(extraColor);
                ivPlaceTab.setColorFilter(extraColor);
                ivNotificationTab.setColorFilter(extraColor);
                ivMessageTab.setColorFilter(mainColor);
                ivInformationTab.setColorFilter(extraColor);
                break;
            case 4:
                ivJobTab.setColorFilter(extraColor);
                ivPlaceTab.setColorFilter(extraColor);
                ivNotificationTab.setColorFilter(extraColor);
                ivMessageTab.setColorFilter(extraColor);
                ivInformationTab.setColorFilter(mainColor);
                break;
        }
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    public void setJobTabControlListener(JobTabControlListener jobTabControlListener) {
        this.jobTabControlListener = jobTabControlListener;
    }
}