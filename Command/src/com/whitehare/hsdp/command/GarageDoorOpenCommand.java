package com.whitehare.hsdp.command;

import org.apache.log4j.Logger;

import com.whitehare.hsdp.command.items.GarageDoor;

public class GarageDoorOpenCommand implements Command
{
  static Logger logger = Logger.getLogger("com.whitehare.hsdp.command");
  GarageDoor    garageDoor;

  public GarageDoorOpenCommand(GarageDoor garageDoor)
  {
    this.garageDoor = garageDoor;
  }

  public void execute()
  {
    logger.debug("Opening Garage Door");
    garageDoor.open();
  }

}
