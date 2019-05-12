package com.example.tacomiendo.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.tacomiendo.Models.Product;
import com.example.tacomiendo.R;
import java.util.ArrayList;
import java.util.List;

public class TopChartsAdapter extends ArrayAdapter<Product> {

    private Context context;
    private List<Product> products;

    //constructor, call on creation
    public TopChartsAdapter(Context context, int resource, ArrayList<Product> objects) {
        super(context, resource, objects);
        this.context = context;
        this.products = objects;
    }

    //called when rendering the list
    public View getView(final int position, View convertView, ViewGroup parent) {
        //get the property we are displaying
        Product product = products.get(position);

        //get the inflater and inflate the XML layout for each item
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view =  inflater.inflate(R.layout.list_item_top_charts,  null);

        TextView name = (TextView) view.findViewById(R.id.item_name_top_charts);
        TextView pricing = (TextView) view.findViewById(R.id.pricing_top_charts);
        ImageView image = (ImageView) view.findViewById(R.id.image_top_chart);

        //set price and rental attributes
        name.setText(product.getName());
        pricing.setText("$ "+product.getPrice());
        image.setImageResource(product.getImageId());

        return view;
    }
}
