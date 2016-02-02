package com.example.stewart.mysunshine;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.stewart.mysunshine.model.Forecast;
import com.example.stewart.mysunshine.service.ISunshineService;
import com.example.stewart.mysunshine.ui.ForecastAdapter;
import com.example.stewart.mysunshine.util.ServiceTool;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MySunshineActivity extends AppCompatActivity {

    private static final String TAG = "MySunshineActivity";
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private ForecastAdapter mForecastAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_sunshine);
        init("97013", "json", "metric", 7);
    }

    private void init(String zipcode, String responseMode,
                      String scientificUnit, int daysToGet) {
        initToolbar();
        initForecastView();
        searchForForecast(zipcode, responseMode, scientificUnit, daysToGet);
    }

    private void initForecastView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.forcast_view);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
    }


    private void searchForForecast(String zipCode, String mode, String units, int days) {
        ISunshineService sunshineService = ServiceTool.INSTANCE.getSunshineService();
        sunshineService.getWeeklyForecast(zipCode, mode, units, days, new Callback<Forecast>() {
            @Override
            public void success(Forecast forecast, Response response) {
                showForecast(forecast);
            }

            @Override
            public void failure(RetrofitError error) {
                Log.d(TAG, "Error: " + error);
            }
        });
    }

    private void showForecast(Forecast forecast){
        // specify an adapter (see also next example)
        if(mForecastAdapter == null) {
            mForecastAdapter = new ForecastAdapter(forecast);
            mRecyclerView.setAdapter(mForecastAdapter);
        } else {
            mForecastAdapter.notifyDataSetChanged();
        }
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_sunshine, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
