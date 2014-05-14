package com.whitehare.hsdp.command.remote;

import com.whitehare.hsdp.command.Command;

public class SimpleRemoteControl
{
  Command slot;

  public SimpleRemoteControl()
  {
  }

  public void setCommand(Command command)
  {
    slot = command;
  }

  public void buttonWasPressed()
  {
    slot.execute();
  }

}
