package com.wipro.weather.activities;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.wipro.weather.R;
import com.wipro.weather.activities.controllers.FetchWeather;
import com.wipro.weather.adapters.WeatherRecyclerViewAdapter;
import com.wipro.weather.data.WeatherData;
import com.wipro.weather.data.WeatherMain;

import java.util.ArrayList;

public class WeatherActivity extends AppCompatActivity {

    /**
     * Weather activity presenter class
     */
    private FetchWeather mFetchWeather;

    /**
     * Object containing loading view
     */
    private ProgressDialog loadingDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        //Show loading countries dialog
        showLoadingCountries();
        //Ask for 5 days forecast to then webservice
        mFetchWeather = new FetchWeather(this);
        mFetchWeather.get5DaysForecast();

    }

    /**
     * Initialize a Recycler view and show a list of weather forecast
     * @param mWeatherList weather forecast list
     */
    public void show5DaysForecast(ArrayList<WeatherData> mWeatherList)
    {

        //Free FetchWeather object
        mFetchWeather= null;
        //Close loading dialog
        loadingDialog.dismiss();
        //Inflate recycler view with the list of  weather forecast
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.activity_weather_forecast_list);
        assert recyclerView != null;
        recyclerView.setAdapter(new WeatherRecyclerViewAdapter(mWeatherList, this));

    }

    /**
     * Show a generic error when the app was trying to get the weather forecast
     */
    public void showGenericError()
    {

        //Setup generic error alert dialog
        Dialog dialog = new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Error")
                .setMessage("An error occur trying to get 5 days forecast")
                .setPositiveButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                }).create();
        //Do not allow user to touch outside the alert to close it
        dialog.setCanceledOnTouchOutside(false);
        //Show the dialog
        dialog.show();
    }

    /**
     * Show loading dialog
     */
    public void showLoadingCountries() {
        //Setup loading dialog
        loadingDialog = new ProgressDialog(this);
        loadingDialog.setTitle("Loading...");
        loadingDialog.setMessage("Getting 5 days forecast, please wait");
        //Show loading dialog
        loadingDialog.show();
    }
}
