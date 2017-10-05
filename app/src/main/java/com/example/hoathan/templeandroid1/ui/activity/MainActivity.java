package com.example.hoathan.templeandroid1.ui.activity;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hoathan.templeandroid.R;
import com.example.hoathan.templeandroid1.ui.BaseActivity;
import com.example.hoathan.templeandroid1.ui.fragment.CameraFragment;
import com.example.hoathan.templeandroid1.ui.fragment.home.HomeFragment;
import com.example.hoathan.templeandroid1.ui.fragment.news.NewsFragment;
import com.example.hoathan.templeandroid1.ui.fragment.settings.SettingFragment;

public class MainActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener {
    private FragmentTabHost tabHost;
    public Toolbar toolbar;
    private DrawerLayout drawerLayout;


    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initialViews(Bundle savedInstanceState) {
        tabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);

        tabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        tabHost.addTab(tabHost.newTabSpec(TITLE_HOME).setIndicator(getTabIndicator(this, TITLE_HOME,
                R.drawable.ic_widget_home)), HomeFragment.class, null);

        tabHost.addTab(tabHost.newTabSpec(TITLE_NEWS).setIndicator(getTabIndicator(this, TITLE_NEWS,
                R.drawable.ic_widget_news)), NewsFragment.class, null);

        tabHost.addTab(tabHost.newTabSpec(TITLE_SETTINGS).setIndicator(getTabIndicator(this, TITLE_SETTINGS,
                R.drawable.ic_widget_settings)), SettingFragment.class, null);

        setCurrentTab(TITLE_HOME);
        pushFragment(new HomeFragment(), true);
        // lang nghe su kien thay doi cua tabhost de thiet lap lai currentab va giaodien cua tung tab tuong ung
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {

            @Override
            public void onTabChanged(String tabId) {//tab id la tag va giong ten vs ten cua stack trong lop base

                setCurrentTab(tabId);

                // neu stack cua tab chuyen den chua  co phan tu nao thi push fragment cua tab day,
                // con ko thi se lay fragment cuoi cung cua stack do de hien thi
             /*   if (typeStackMap.get(tabId).size() == 0) {
                    if (tabId.equals(TITLE_HOME)) {
                        pushFragment(new HomeFragment(), true);
                        


                    } else if (tabId.equals(TITLE_NEWS)) {
                        pushFragment(new NewsFragment(), true);

                    } else if (tabId.equals(TITLE_SETTINGS)) {
                        pushFragment(new SettingFragment(), true);
                    }
                } else {
                    pushFragment(typeStackMap.get(tabId).lastElement(), false);
                }*/
                if (tabId.equals(TITLE_SETTINGS)){
                    showToolbar(false);
                }else {
                    showToolbar(true);
                }
             switch (tabId){
                 case TITLE_HOME:
                     if (typeStackMap.get(tabId).size() > 1 ){
                         Toast.makeText(MainActivity.this, "aaa", Toast.LENGTH_SHORT).show();
                         pushFragment(new HomeFragment(),true);
                     }else {

                     }

                    getSupportActionBar().setTitle("Home");
                     break;
                 case TITLE_NEWS:
                    pushFragment(new NewsFragment(),true);
                     getSupportActionBar().setTitle("New");
                     break;
                 case TITLE_SETTINGS:
                    pushFragment(new SettingFragment(),true);
                     getSupportActionBar().setTitle("Setting");

                     break;
             }
            }
        });
        initView();
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);


    }


    private View getTabIndicator(Context context, String title, int icon) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_widget, null);

        ImageView iconTab = (ImageView) view.findViewById(R.id.iconTab);
        TextView titleTab = (TextView) view.findViewById(R.id.titleTab);

        iconTab.setImageResource(icon);
        titleTab.setText(title);

        XmlResourceParser xmlRP = getResources().getXml(R.xml.tabhost_change_text_color);
        try {
            ColorStateList colorStateList = ColorStateList.createFromXml(getResources(), xmlRP);
            titleTab.setTextColor(colorStateList);

        } catch (Exception e) {
            e.printStackTrace();

        }

        return view;
    }

    @Override
    protected void initialVariables() {

    }

    @Override
    protected int getFragmentContainerResID() {
        return android.R.id.tabcontent;
    }

    public void switchTab(int position){
        tabHost.setCurrentTab(position);
    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbarmain);
        toolbar.setTitle("hoa than");
        toolbar.setSubtitle("!!!!!");
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_camera:
                setCurrentTab(TITLE_CAMERA);
                pushFragment(new CameraFragment(),true);
                break;
            case  R.id.nav_gallery:
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);


        return true;
    }
    private void showToolbar(boolean show) {
        if (show) {
            getSupportActionBar().show();
        } else {
            getSupportActionBar().hide();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
