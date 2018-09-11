package com.example.goodluck.smartpub;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    /**Context of the app*/
    public Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        /**Context of the app*/
        mContext=context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new  SoftDrinksFragment();
        } else
        return null;
    }

    @Override
    public int getCount() {
        return 1;
    }
    /***
     * now we create this override method so can help us to create tabs
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return mContext.getString(R.string.SoftDrinks);
        }else
        return null;
    }
}
