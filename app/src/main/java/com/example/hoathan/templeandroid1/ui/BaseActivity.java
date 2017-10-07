package com.example.hoathan.templeandroid1.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public abstract class BaseActivity extends AppCompatActivity {
    public static final String TITLE_HOME = "Home";
    public static final String TITLE_NEWS = "News";
    public static final String TITLE_SETTINGS = "Settings";

    public static final String TITLE_CAMERA = "Camera";



    public Map<String, Stack<Fragment>> typeStackMap;
    protected String currentTab = TITLE_HOME;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());

        initialStackFragment();
        initialViews(savedInstanceState);
        initialVariables();
    }

    private void initialStackFragment() {
        typeStackMap = new HashMap<>();

        typeStackMap.put(TITLE_HOME, new Stack<Fragment>());
        typeStackMap.put(TITLE_NEWS, new Stack<Fragment>());
        typeStackMap.put(TITLE_SETTINGS, new Stack<Fragment>());
        typeStackMap.put(TITLE_CAMERA, new Stack<Fragment>());
    }

    protected abstract int setLayout();

    protected abstract void initialViews(Bundle savedInstanceState);

    protected abstract void initialVariables();

    protected abstract int getFragmentContainerResID();

    public void pushFragment(Fragment fragment, boolean shoulAdd) {
        if (shoulAdd) {
            typeStackMap.get(currentTab).push(fragment);
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        fragmentTransaction.replace(getFragmentContainerResID(), fragment, fragment.getClass().getSimpleName());
        fragmentTransaction.commitAllowingStateLoss();

    }

    public void pushFragment(Fragment fragment, boolean shoulAdd,Bundle bundle) {
        if (bundle != null) {
            fragment.setArguments(bundle);
        }
        if (shoulAdd) {
            typeStackMap.get(currentTab).push(fragment);
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        fragmentTransaction.replace(getFragmentContainerResID(), fragment, fragment.getClass().getSimpleName());
        fragmentTransaction.commitAllowingStateLoss();

    }

    public void popFragment() {
        Stack<Fragment> currentStack = typeStackMap.get(currentTab);
        if (currentStack.size() > 1) {
            Fragment fragment = currentStack.elementAt(currentStack.size() - 2);
            currentStack.pop();
            if (fragment != null) {
                pushFragment(fragment, false);
            }

        }
    }

    public void popFragment(Bundle bundle) {
        Stack<Fragment> currentStack = typeStackMap.get(currentTab);
        if (currentStack.size() > 1) {
            Fragment fragment = currentStack.elementAt(currentStack.size() - 2);
            currentStack.pop();
            if (fragment != null) {
                if (bundle != null) {
                    fragment.setArguments(bundle);
                }

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
                fragmentTransaction.replace(getFragmentContainerResID(), fragment, fragment.getClass().getSimpleName());
                fragmentTransaction.commitAllowingStateLoss();
            }
        }


    }

    @Override
    public void onBackPressed() {
        if (typeStackMap.get(currentTab).size() <= 1 ){
            super.onBackPressed();
        } else {
            popFragment();
        }
    }

    public void setCurrentTab(String currentTab) {
        this.currentTab = currentTab;
    }
}
