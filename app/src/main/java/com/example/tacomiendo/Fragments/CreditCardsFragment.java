package com.example.tacomiendo.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tacomiendo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CreditCardsFragment extends Fragment {


    public CreditCardsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_credit_cards, container, false);
    }

}
