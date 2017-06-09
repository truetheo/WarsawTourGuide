package com.example.a.theowarsawtourapp;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class WarsawTourFragmentAdapter extends FragmentPagerAdapter {
    public WarsawTourFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new PlacesFragment();
            case 1: return new MuseumsFragment();
            case 2: return new BeerPubsFragment();
            default:
                return new OtherFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "Places";
            case 1: return "Museums";
            case 2: return "Beer Pubs";
            default:
                return "Other";
        }


    }
}
