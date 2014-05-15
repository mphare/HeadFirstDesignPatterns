package com.whitehare.hsdp.command;

import org.apache.log4j.Logger;

import com.whitehare.hsdp.command.items.CeilingFan;

public class CeilingFanOffCommand implements Command
{
  static Logger logger = Logger.getLogger("com.whitehare.hsdp.command");
  CeilingFan    ceilingFan;
  int           prevSpeed;

  public CeilingFanOffCommand(CeilingFan ceilingFan)
  {
    this.ceilingFan = ceilingFan;
  }

  public void execute()
  {
    logger.debug("Turning the Fan OFF");
    prevSpeed = ceilingFan.getSpeed();
    ceilingFan.off();
  }

  public void undo()
  {
    logger.debug("Undo");

    if (prevSpeed == CeilingFan.HIGH)
    {
      ceilingFan.high();
    } else if (prevSpeed == CeilingFan.MEDIUM)
    {
      ceilingFan.medium();
    } else if (prevSpeed == CeilingFan.LOW)
    {
      ceilingFan.low();
    } else if (prevSpeed == CeilingFan.OFF)
    {
      ceilingFan.off();
    }

  }
}
