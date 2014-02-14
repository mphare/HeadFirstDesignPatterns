package com.whitehare.hsdp.observer.own;

public class CurrentConditionDisplay implements Observer, DisplayElement
{
  private float   temperature;
  private float   humidity;
  private float   pressure;
  private float   heatIndex;
  private Subject weatherData;

  public CurrentConditionDisplay(Subject weatherData)
  {
    this.weatherData = weatherData;
    weatherData.registerObserver((com.whitehare.hsdp.observer.own.Observer) this);
  }

  public void update(float temperature, float humidity, float pressure, float heatIndex)
  {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    this.heatIndex = heatIndex;
    display();
  }

  public void display()
  {
    System.out.println("Current conditions: " + temperature + "F degrees and " + humidity
        + "% humidity and a heat index of " + heatIndex);

  }

}
