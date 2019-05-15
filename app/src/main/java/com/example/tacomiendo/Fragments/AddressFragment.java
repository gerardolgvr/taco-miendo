package com.example.tacomiendo.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.example.tacomiendo.Adapters.AddressAdapter;
import com.example.tacomiendo.Models.Address;
import com.example.tacomiendo.Models.Product;
import com.example.tacomiendo.R;

import java.util.ArrayList;

public class AddressFragment extends Fragment {


    public AddressFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_address, container, false);
        //create our new array adapter
        AddressAdapter adapter = new AddressAdapter(getContext(), 0, getData());
        //Find list view and bind it with the custom adapter
        ListView listView = (ListView) view.findViewById(R.id.list_addresses);
        listView.setAdapter(adapter);

        return view;
    }

    public ArrayList<Address> getData(){
        ArrayList<Address> addresses  = new ArrayList<>();
        addresses.add(new Address(1, "Jabali 675", "Colonia Nueva Visión", "Chetumal", "555-555-555"));
        addresses.add(new Address(1, "Av. Andrés Quintana Roo", "Colonia Aserradero", "Chetumal", "555-555-555"));
        return addresses;
    }

}
