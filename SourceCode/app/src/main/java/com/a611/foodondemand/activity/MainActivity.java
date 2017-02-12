package com.a611.foodondemand.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.a611.foodondemand.R;
import com.a611.foodondemand.adapter.BaseFragmentPagerAdapter;
import com.a611.foodondemand.fragment.OneFragment;
import com.a611.foodondemand.utils.CommonUtil;

/**
 * Created by pnhung on 2/12/2017.
 */

public class MainActivity extends BaseAppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new OneFragment(), "ONE");
        adapter.addFragment(new OneFragment(), "TWO");
        viewPager.setAdapter(adapter);
    }

    @Override
    protected int getContainerId() {
        return R.layout.activity_main;
    }

    @Override
    protected void findViewById() {
        toolbar = CommonUtil.findViewById(this, R.id.toolbar);
        tabLayout = CommonUtil.findViewById(this, R.id.tabs);
        viewPager = CommonUtil.findViewById(this, R.id.viewpager);
    }

    @Override
    protected String titleName() {
        return "Main Activity";
    }

    @Override
    protected void changeTitleActivity(Toolbar toolbar)
    {
        super.changeTitleActivity(toolbar);
    }

    class ViewPagerAdapter extends BaseFragmentPagerAdapter {
        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }
    }
}
