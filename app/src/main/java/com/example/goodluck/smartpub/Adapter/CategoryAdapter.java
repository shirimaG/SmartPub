package com.example.goodluck.smartpub.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.goodluck.smartpub.Fragment.BeersFragment;
import com.example.goodluck.smartpub.Fragment.SpiritsFragment;
import com.example.goodluck.smartpub.R;
import com.example.goodluck.smartpub.Fragment.SoftDrinksFragment;

public class CategoryAdapter extends FragmentPagerAdapter {
    /**Context of the app*/
    public Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext=context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SoftDrinksFragment();
        } else if (position == 1) {
            return new BeersFragment();
        } else if (position == 2) {
            return new SpiritsFragment();
        } else
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
    /***
     * now we create this override method so can help us to create tabs
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.SoftDrinks);
        } else if (position == 1) {
            return mContext.getString(R.string.Beers);
        } else if (position == 2){
            return mContext.getString(R.string.Spirits);
        }else
        return null;
    }
}
