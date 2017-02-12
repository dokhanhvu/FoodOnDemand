package com.a611.foodondemand.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.a611.foodondemand.R;

/**
 * Created by pnhung on 2/12/2017.
 */

public class OneFragment extends BaseFragment {

    public OneFragment() {

    }

    @Override
    protected int getContainerId() {
        return R.layout.fragment_one;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
