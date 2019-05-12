package com.example.tacomiendo.Fragments;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tacomiendo.Adapters.CategoryPagerAdapter;
import com.example.tacomiendo.Adapters.ProfilePagerAdapter;
import com.example.tacomiendo.R;

public class CategoryFragment extends Fragment {

    //tablayout element
    TabLayout tabLayout;

    public CategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category, container, false);

        tabLayout = (TabLayout) view.findViewById(R.id.category_tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Platillos"));
        tabLayout.addTab(tabLayout.newTab().setText("Bebidas"));
        tabLayout.addTab(tabLayout.newTab().setText("Postres"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) view.findViewById(R.id.category_viewPager);
        CategoryPagerAdapter adapter = new CategoryPagerAdapter(getFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener( new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                viewPager.setCurrentItem(position);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return view;
    }

}
