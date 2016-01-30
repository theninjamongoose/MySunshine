package com.example.stewart.mysunshine.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.stewart.mysunshine.R;
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
        public ImageView mWeatherIcon;
        public TextView mDailyTempRange;
        public TextView mDayOfWeek;
        public ViewHolder(RelativeLayout v) {
            super(v);
            mWeatherIcon = (ImageView) v.findViewById(R.id.weather_icon_image_view);
            mDailyTempRange = (TextView) v.findViewById(R.id.day_temp_range_text_view);
            mDayOfWeek = (TextView) v.findViewById(R.id.day_of_week_text_view);
        }
    }


    @Override
    public ForecastAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.daily_forecast_row, parent, false);
        // set the view's size, margins, paddings and layout parameters
        mWeatherIcon = (ImageView) v.findViewById(R.id.weather_icon_image_view);
        m


        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ForecastAdapter.ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        //set shit here

//        holder.mTextView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mForecast.getList().size();
    }
}
