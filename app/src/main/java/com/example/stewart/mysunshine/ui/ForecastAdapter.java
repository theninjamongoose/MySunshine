package com.example.stewart.mysunshine.ui;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.stewart.mysunshine.model.Forecast;

/**
 * Created by sstew5 on 1/28/16.
 */
public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ViewHolder>{
    private Forecast mForecast;

    public ForecastAdapter(Forecast forecast) {
        mForecast = forecast;
    }

    public void setForecast(Forecast forecast){
        mForecast = forecast;
    }

    public Forecast getForecast(){
        return mForecast;
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public ViewHolder(TextView v) {
            super(v);
            mTextView = v;
        }
    }


    @Override
    public ForecastAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ForecastAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
