package com.kodilla.task.proxy.db;

public class MyWeatherForecast implements WeatherForecast{

    @Override
    public String getWeather() {
        return "Today is a beautiful sunny day";
    }

    @Override
    public void refreshData() throws InterruptedException {
        Thread.sleep(5000);
    }
}
