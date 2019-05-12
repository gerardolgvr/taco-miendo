package com.example.tacomiendo.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.tacomiendo.Fragments.AddressFragment;
import com.example.tacomiendo.Fragments.CreditCardsFragment;
import com.example.tacomiendo.Fragments.ProfileFragment;

public class ProfilePagerAdapter extends FragmentStatePagerAdapter {

    private int numberOfTabs;

    public ProfilePagerAdapter(FragmentManager fm, int numberOfTabs){
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ProfileFragment();
            case 1:
                return new AddressFragment();
            case 2:
                return new CreditCardsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
