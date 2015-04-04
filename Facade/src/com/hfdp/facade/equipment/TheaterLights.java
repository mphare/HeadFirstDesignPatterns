package com.hfdp.facade.equipment;
public class TheaterLights
{

  public void dim()
  {
    // TODO Auto-generated method stub
    System.out.println("Lights are dimming");
    lightLevel(3);
  }

  public void on()
  {
    // TODO Auto-generated method stub
    System.out.println("Lights are bright");
    lightLevel(10);
  }

  public void off()
  {
    System.out.println("Lights are off");
    lightLevel(0);

  }

  public void lightLevel(int level)
  {
    System.out.println("Lights are set to level " + level);
  }
}
