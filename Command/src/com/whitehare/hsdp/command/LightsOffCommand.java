package com.whitehare.hsdp.command;

import org.apache.log4j.Logger;

import com.whitehare.hsdp.command.items.Light;

public class LightsOffCommand implements Command
{
  static Logger logger = Logger.getLogger("com.whitehare.hsdp.command");
  Light         light;

  public LightsOffCommand(Light light)
  {

    this.light = light;
  }

  public void execute()
  {
    logger.debug("Turning the Light OFF");
    light.off();
  }

  public void undo()
  {
    // TODO Auto-generated method stub
    light.on();

  }

}
