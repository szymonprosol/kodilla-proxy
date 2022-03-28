package com.kodilla.task.proxy;

import com.kodilla.task.proxy.db.LazyWeatherForecastProxy;
import com.kodilla.task.proxy.db.MyWeatherForecast;
import com.kodilla.task.proxy.db.WeatherForecast;

import java.util.Random;

public class ProxyApp {

    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();
        for (int n = 0; n < 5; n++) {
            WeatherForecast weatherForecast = new LazyWeatherForecastProxy();
            int number = new Random().nextInt(100);

            System.out.println(weatherForecast.getWeather());

            if (number < 20) weatherForecast.refreshData();

            System.out.println("Execution #" + n + " just finished");
        }

        long end = System.currentTimeMillis();
        System.out.println("The execution took: " + (end - begin) + " [ms]");
    }
}
