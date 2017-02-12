package com.a611.foodondemand.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.a611.foodondemand.fragment.NavigationFragment;

/**
 * Created by pnhung on 2/11/2017.
 */

public abstract class BaseAppCompatActivity extends AppCompatActivity {

    protected Toolbar toolbar;
    protected NavigationFragment naviFragment;

    protected abstract int getContainerId();
    protected  abstract void findViewById();
    protected  abstract String titleName();

    protected  void changeTitleActivity(Toolbar toolbar) {
        toolbar.setTitle(titleName());
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(getContainerId());
        findViewById();
        changeTitleActivity(toolbar);
    }
}
