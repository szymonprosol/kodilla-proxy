package com.kodilla.task.proxy.db;

import com.kodilla.proxy.db.PostgresDataRetriever;

public class LazyWeatherForecastProxy implements WeatherForecast {

    private WeatherForecast weatherForecast;

    @Override
    public String getWeather() throws InterruptedException {
        if (weatherForecast == null)
            weatherForecast = new MyWeatherForecast();
        return weatherForecast.getWeather();
    }

    public void refreshData() throws InterruptedException {
        if (weatherForecast == null)
            weatherForecast = new MyWeatherForecast();
        weatherForecast.refreshData();
    }
}
