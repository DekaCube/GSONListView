package com.example.gsonlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StockListAdapter extends ArrayAdapter<Stock> {
    Context mContext;


    public StockListAdapter(Context context, ArrayList<Stock> items) {
        super(context, 0, items);

        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Stock stock = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.recycler_view_item, parent, false);
        }
        // Lookup view for data population
        TextView ltd = (TextView) convertView.findViewById(R.id.ltd);
        TextView cp = (TextView) convertView.findViewById(R.id.cp);
        TextView symbol = (TextView) convertView.findViewById(R.id.symbol);
        TextView price = (TextView) convertView.findViewById(R.id.price);
        // Populate the data into the template view using the data object
        cp.setText(stock.getChange_percent());
        ltd.setText(stock.getLatest_trading_day());
        symbol.setText(stock.getSymbol());
        price.setText(stock.getPrice());
        // Return the completed view to render on screen
        return convertView;
    }


}
