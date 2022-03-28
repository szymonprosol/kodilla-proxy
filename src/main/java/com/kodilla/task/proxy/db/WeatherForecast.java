package com.kodilla.task.proxy.db;

public interface WeatherForecast {
    String getWeather() throws InterruptedException;
    void refreshData() throws InterruptedException;
}
