package com.wipro.weather.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Miguel Benitez on 17/03/2017.
 */
public class WeatherMain {

    @SerializedName("temp")
    @Expose
    private String temp;

    @SerializedName("pressure")
    @Expose
    private String pressure;

    public String getTemp() {
        return temp;
    }

    public String getPressure() {
        return pressure;
    }

    @Override
    public String toString() {
        return "WeatherMain{" +
                "temp='" + temp + '\'' +
                ", pressure='" + pressure + '\'' +
                '}';
    }
}
