package com.example.stewart.mysunshine.util;

import com.example.stewart.mysunshine.service.ISunshineService;

import retrofit.RestAdapter;

/**
 * Created by sstew5 on 1/28/16.
 */
public enum ServiceTool {
    INSTANCE;
    private final RestAdapter REST_ADAPTER = new RestAdapter.Builder().setEndpoint(SunshineConfig.SUNSHINE_API_URL).build();
    private final ISunshineService SUNSHINE_SERVICE = REST_ADAPTER.create(ISunshineService.class);

    public ISunshineService getSunshineService() {
        return SUNSHINE_SERVICE;
    }
}
