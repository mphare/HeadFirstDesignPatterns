package com.whitehare.hsdp.command;

import com.whitehare.hsdp.command.items.GarageDoor;

public class GarageDoorOpenCommand implements Command
{
  GarageDoor garageDoor;

  public GarageDoorOpenCommand(GarageDoor garageDoor)
  {
    this.garageDoor = garageDoor;
  }

  public void execute()
  {
    garageDoor.open();
  }

}
