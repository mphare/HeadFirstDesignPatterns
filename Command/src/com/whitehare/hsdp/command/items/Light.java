package com.whitehare.hsdp.command.items;

import org.apache.log4j.Logger;

public class Light
{
  static Logger  logger = Logger.getLogger("com.whitehare.hsdp.command");
  private String name;

  public Light(String name)
  {
    this.setName(name);
  }

  public void on()
  {
    logger.debug("Light is ON");

  }

  public void off()
  {
    logger.debug("Light is OFF");

  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

}
