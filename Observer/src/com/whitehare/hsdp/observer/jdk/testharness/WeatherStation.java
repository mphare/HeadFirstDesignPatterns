package com.whitehare.hsdp.observer.jdk.testharness;

import com.whitehare.hsdp.observer.jdk.CurrentConditionDisplay;
import com.whitehare.hsdp.observer.jdk.WeatherData;

public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(
				weatherData);

		// StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);

	}
}
