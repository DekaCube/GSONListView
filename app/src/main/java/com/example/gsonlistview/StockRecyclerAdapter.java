package com.example.gsonlistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StockRecyclerAdapter extends RecyclerView.Adapter<StockRecyclerAdapter.ViewHolder> {

    private ArrayList<Stock> mLocalData;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView cp;
        private TextView symbol;
        private TextView ltd;
        private TextView price;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
            cp = view.findViewById(R.id.cp);
            symbol = view.findViewById(R.id.symbol);
            price = view.findViewById(R.id.price);
            ltd = view.findViewById(R.id.ltd);

        }

        public TextView getltd() {
            return ltd;
        }

        public TextView getsymbol(){
            return symbol;
        }

        public TextView getcp(){
            return cp;
        }

        public TextView getprice(){
            return price;
        }
    }

    public StockRecyclerAdapter(ArrayList<Stock> dataSet) {
        mLocalData = dataSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_view_item, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.getltd().setText(mLocalData.get(position).getLatest_trading_day());
        viewHolder.getprice().setText("$" + mLocalData.get(position).getPrice());
        viewHolder.getcp().setText(mLocalData.get(position).getChange_percent());
        viewHolder.getsymbol().setText(mLocalData.get(position).getSymbol());
    }

    @Override
    public int getItemCount() {
        return mLocalData.size();
    }





}
