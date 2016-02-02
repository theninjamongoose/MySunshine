package com.example.stewart.mysunshine.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.stewart.mysunshine.R;
import com.example.stewart.mysunshine.model.Forecast;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.util.Date;

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
        public Context mContext;
        public ViewHolder(LinearLayout linearLayout) {
            super(linearLayout);
            mWeatherIcon = (ImageView) linearLayout.findViewById(R.id.weather_icon_image_view);
            mDailyTempRange = (TextView) linearLayout.findViewById(R.id.day_temp_range_text_view);
            mDayOfWeek = (TextView) linearLayout.findViewById(R.id.day_of_week_text_view);
            mContext = linearLayout.getContext();
        }
    }

    @Override
    public ForecastAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder((LinearLayout) LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.daily_forecast_row, parent, false));
    }

    @Override
    public void onBindViewHolder(ForecastAdapter.ViewHolder holder, int position) {

        //todo Image

        holder.mDailyTempRange.setText(mForecast.getDayForecasts().get(position).getTemp().getMax() +
                " | " + mForecast.getDayForecasts().get(position).getTemp().getMin());

        //todo day of week might be wrong? not sure... need to try on device
        String localDayOfWeek = DateUtils.formatDateTime(holder.mContext,
                new DateTime(mForecast.getDayForecasts().get(position).getDt().intValue()*1000).getMillis(), DateUtils.FORMAT_SHOW_WEEKDAY);
        holder.mDayOfWeek.setText(localDayOfWeek);
    }

    @Override
    public int getItemCount() {
        return mForecast.getDayForecasts().size();
    }
}
