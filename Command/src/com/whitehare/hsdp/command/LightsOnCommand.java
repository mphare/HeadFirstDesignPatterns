package com.whitehare.hsdp.command;

import com.whitehare.hsdp.command.items.Light;

public class LightsOnCommand implements Command
{
  // static Logger log4j = Logger.getLogger(LightsOnCommand.class);
  Light light;

  public LightsOnCommand(Light light)
  {
    this.light = light;
  }

  public void execute()
  {
    // log4j.debug("Turning the Light ON");
    light.on();
  }

}
