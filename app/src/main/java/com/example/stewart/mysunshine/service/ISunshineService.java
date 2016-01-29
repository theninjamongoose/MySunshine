package com.example.stewart.mysunshine.service;


import com.example.stewart.mysunshine.model.Forecast;
import com.example.stewart.mysunshine.util.SunshineConfig;

import java.lang.String;import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by sstew5 on 9/4/15.
 */
public interface ISunshineService {

    @GET("/data/2.5/forecast/daily?APPID=" + SunshineConfig.APP_KEY)
    void getWeeklyForecast(@Query("q") String zipCode, @Query("mode") String mode,
                           @Query("units") String units, @Query("cnt") int days,
                       Callback<Forecast> callback);
}
