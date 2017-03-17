package com.wipro.weather;



import com.wipro.weather.activities.WeatherActivity;

import junit.framework.TestSuite;


public class TestApp extends AbstractSystemTestBase<WeatherActivity> {

    public TestApp() {
        super(WeatherActivity.class);
    }

    public static TestSuite suite() {
        TestSuite t = new TestSuite();

        t.addTestSuite(TestCountries.class);
        t.addTestSuite(TestCountryDetail.class);
        //TODO Test parcelable classes
        //TODO Test RESTWeather

        return t;
    }

}
