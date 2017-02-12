package com.a611.foodondemand.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by pnhung on 2/11/2017.
 */

public abstract class BaseAppCompatActivity extends AppCompatActivity {

    protected abstract int getContainerId();
    protected  abstract void findViewById();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(getContainerId());
        findViewById();
    }
}
