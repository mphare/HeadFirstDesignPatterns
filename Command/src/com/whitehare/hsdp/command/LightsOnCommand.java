package com.whitehare.hsdp.command;

import org.apache.log4j.Logger;

import com.whitehare.hsdp.command.items.Light;

public class LightsOnCommand implements Command
{
  static Logger logger = Logger.getLogger("com.whitehare.hsdp.command");
  Light         light;

  public LightsOnCommand(Light light)
  {
    this.light = light;
  }

  public void execute()
  {
    logger.debug("Turning the Light ON");
    light.on();
  }

}
