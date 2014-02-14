package com.whitehare.hsdp.observer.own.testharness;

import com.whitehare.hsdp.observer.own.CurrentConditionDisplay;
import com.whitehare.hsdp.observer.own.WeatherData;

public class WeatherStation
{
  public static void main(String[] args)
  {
    WeatherData weatherData = new WeatherData();
    CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);

    // StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    // ForecastDisplay forecaseDisplay = new ForecastDisplay(weatherData);

    weatherData.setMeasurements(80f, 65f, 30.4f);
    weatherData.setMeasurements(82f, 70f, 29.2f);
    weatherData.setMeasurements(78f, 90f, 29.2f);

  }

}
