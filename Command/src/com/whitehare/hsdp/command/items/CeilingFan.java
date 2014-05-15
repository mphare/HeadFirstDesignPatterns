package com.whitehare.hsdp.command.items;

import org.apache.log4j.Logger;

public class CeilingFan
{
  static Logger           logger = Logger.getLogger("com.whitehare.hsdp.command");
  public static final int HIGH   = 3;
  public static final int MEDIUM = 2;
  public static final int LOW    = 1;
  public static final int OFF    = 0;

  String                  location;
  int                     speed;

  public CeilingFan(String location)
  {
    this.location = location;
    speed = OFF;
  }

  public void high()
  {
    logger.debug("Fan is HIGH");
    speed = HIGH;
  }

  public void medium()
  {
    logger.debug("Fan is MEDIUM");
    speed = MEDIUM;
  }

  public void low()
  {
    logger.debug("Fan is LOW");
    speed = LOW;
  }

  public void off()
  {
    logger.debug("Fan is OFF");
    speed = OFF;
  }

  public int getSpeed()
  {
    return speed;
  }
}
