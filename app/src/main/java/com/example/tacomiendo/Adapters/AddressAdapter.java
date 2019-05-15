package com.example.tacomiendo.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.tacomiendo.Models.Address;
import com.example.tacomiendo.R;
import java.util.ArrayList;
import java.util.List;

public class AddressAdapter extends ArrayAdapter<Address> {

    private Context context;
    private List<Address> addresses;

    //constructor, call on creation
    public AddressAdapter(Context context, int resource, ArrayList<Address> objects) {
        super(context, resource, objects);
        this.context = context;
        this.addresses = objects;
    }

    //called when rendering the list
    public View getView(final int position, View convertView, ViewGroup parent) {
        //get the property we are displaying
        Address address = addresses.get(position);

        //get the inflater and inflate the XML layout for each item
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view =  inflater.inflate(R.layout.list_item_address,  null);

        TextView edit_address = (TextView) view.findViewById(R.id.item_address);
        TextView edit_neighborhood = (TextView) view.findViewById(R.id.item_neighborhood);
        TextView edit_city = (TextView) view.findViewById(R.id.item_city);
        TextView edit_telephone = (TextView) view.findViewById(R.id.item_telephone);

        //set data
        edit_address.setText(address.getAddress());
        edit_neighborhood.setText(address.getNeighborhood());
        edit_city.setText(address.getCity());
        edit_telephone.setText(address.getTelephone());

        return view;
    }
}
