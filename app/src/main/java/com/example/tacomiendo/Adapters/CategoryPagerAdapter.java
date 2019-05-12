package com.example.tacomiendo.Adapters;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.example.tacomiendo.Fragments.DessertsFragment;
import com.example.tacomiendo.Fragments.DrinksFragment;
import com.example.tacomiendo.Fragments.MealsFragment;

public class CategoryPagerAdapter extends FragmentStatePagerAdapter {

    private int numberOfTabs;

    public CategoryPagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MealsFragment();
            case 1:
                return new DrinksFragment();
            case 2:
                return new DessertsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
