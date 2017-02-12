package com.a611.foodondemand.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.a611.foodondemand.R;
import com.a611.foodondemand.adapter.BaseFragmentPagerAdapter;
import com.a611.foodondemand.fragment.NavigationFragment;
import com.a611.foodondemand.fragment.OneFragment;
import com.a611.foodondemand.utils.CommonUtil;

/**
 * Created by pnhung on 2/12/2017.
 */

public class MainActivity extends BaseAppCompatActivity implements NavigationFragment.FragmentDrawerListener{
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        naviFragment = (NavigationFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        naviFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), toolbar);
        naviFragment.setDrawerListener(this);
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
    protected void changeTitleActivity(Toolbar toolbar) {
        super.changeTitleActivity(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.action_settings:
                Toast.makeText(this, "settings", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.action_search:
                Toast.makeText(this, "search", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

    class ViewPagerAdapter extends BaseFragmentPagerAdapter {
        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }
    }


    @Override
    public void onDrawerItemSelected(View view, int position) {
        switch (position)
        {
            case 0:
                Toast.makeText(this, "HomeNavigation", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(this, "MessagesNavigation", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "FriendNavigation", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
