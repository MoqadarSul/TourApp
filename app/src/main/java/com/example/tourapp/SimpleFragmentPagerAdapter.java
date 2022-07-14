package com.example.tourapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    public SimpleFragmentPagerAdapter(Context context1,@NonNull FragmentManager fm) {
        super(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mContext = context1;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new EntertainmentFragment();
        }else if(position == 1){
            return new EventsFragment();
        }else if(position == 2){
            return new HotelFragment();
        }else {
            return new RestuarantFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.string_entertainment);
        } else if (position == 1) {
            return mContext.getString(R.string.string_events);
        } else if (position == 2) {
            return mContext.getString(R.string.string_hotels);
        }else{
            return mContext.getString(R.string.string_restaurants);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

}
