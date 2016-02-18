package barqsoft.footballscores;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.text.format.Time;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by yehya khaled on 2/27/2015.
 */
public class PagerFragment extends Fragment {
    public static final int NUM_PAGES = 3;
    public ViewPager mPagerHandler;
    private myPageAdapter mPagerAdapter;
    private MainScreenFragment[] viewFragments = new MainScreenFragment[3];


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.pager_fragment, container, false);

        mPagerAdapter = new myPageAdapter(getChildFragmentManager());
        mPagerHandler = (ViewPager) rootView.findViewById(R.id.pager);

        Toolbar toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.action_about) {
                    Intent start_about = new Intent(getActivity().getApplicationContext(), AboutActivity.class);
                    startActivity(start_about);
                    return true;
                }
                return false;
            }
        });

        // Creating 3 tabs
        TabLayout tabLayout = (TabLayout) rootView.findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout
                .newTab()
                .setText(R.string.tab1)
                .setContentDescription(R.string.tab1_desc));

        tabLayout.addTab(tabLayout
                .newTab()
                .setText(R.string.tab2)
                .setContentDescription(R.string.tab2_desc));

        tabLayout.addTab(tabLayout
                .newTab()
                .setText(R.string.tab3)
                .setContentDescription(R.string.tab3_desc));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        // Creating fragments for each tab.
        for (int i = 0; i < NUM_PAGES; i++) {

            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DATE, i - 1);
            SimpleDateFormat mformat = new SimpleDateFormat("yyyy-MM-dd");

            viewFragments[i] = new MainScreenFragment();
            viewFragments[i].setFragmentDate(mformat.format(calendar.getTime()));
        }

        // Add tap handler for tabs
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mPagerHandler.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        mPagerHandler.setAdapter(mPagerAdapter);
        mPagerHandler.setCurrentItem(MainActivity.current_fragment);
        mPagerHandler.addOnPageChangeListener(
                new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        return rootView;
    }

    private class myPageAdapter extends FragmentStatePagerAdapter {
        @Override
        public Fragment getItem(int i) {
            return viewFragments[i];
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }

        public myPageAdapter(FragmentManager fm) {
            super(fm);
        }

        // Returns the page title for the top indicator
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return getDayName(getActivity(), System.currentTimeMillis() + ((position - 2) * 86400000));
//        }

//        public String getDayName(Context context, long dateInMillis) {
//            // If the date is today, return the localized version of "Today" instead of the actual
//            // day name.
//
//            Time t = new Time();
//            t.setToNow();
//            int julianDay = Time.getJulianDay(dateInMillis, t.gmtoff);
//            int currentJulianDay = Time.getJulianDay(System.currentTimeMillis(), t.gmtoff);
//            if (julianDay == currentJulianDay) {
//                return context.getString(R.string.today);
//            } else if (julianDay == currentJulianDay + 1) {
//                return context.getString(R.string.tomorrow);
//            } else if (julianDay == currentJulianDay - 1) {
//                return context.getString(R.string.yesterday);
//            } else {
//                Time time = new Time();
//                time.setToNow();
//                // Otherwise, the format is just the day of the week (e.g "Wednesday".
//                SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
//                return dayFormat.format(dateInMillis);
//            }
//        }
    }
}
