package com.example.tacomiendo.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.tacomiendo.Adapters.TopChartsAdapter;
import com.example.tacomiendo.Models.Product;
import com.example.tacomiendo.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {


    public HomeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //create our new array adapter
        TopChartsAdapter adapter = new TopChartsAdapter(getContext(), 0, getData());
        //Find list view and bind it with the custom adapter
        ListView listView = (ListView) view.findViewById(R.id.listView_top_charts);
        listView.setAdapter(adapter);

        return view;
    }

    public ArrayList<Product> getData(){
        ArrayList<Product> products  = new ArrayList<>();
        products.add(new Product(1, "Cafe Américano", 39, "Bebidas", getIdByName("cafe")));
        products.add(new Product(2, "Camarones", 199, "Platillos", getIdByName("camarones")));
        products.add(new Product(3, "Cóctel", 89, "Postres", getIdByName("coctel")));
        products.add(new Product(4, "Cóctel Jordano", 129, "Postres", getIdByName("coctel_jordano")));
        products.add(new Product(5, "Cup cakes", 39, "Postres", getIdByName("cupcakes_festival")));
        return products;
    }

    public int getIdByName(String name){
        int id = getResources().getIdentifier("com.example.tacomiendo:drawable/" + name, null, null);
        return id;
    }

}
