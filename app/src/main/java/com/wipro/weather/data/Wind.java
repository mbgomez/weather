package com.wipro.weather.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Miguel Benitez on 17/03/2017.
 */
public class Wind {

    @SerializedName("speed")
    @Expose
    private String speed;

    public String getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "speed='" + speed + '\'' +
                '}';
    }
}
