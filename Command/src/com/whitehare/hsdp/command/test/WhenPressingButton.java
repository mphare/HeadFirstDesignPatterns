package com.whitehare.hsdp.command.test;

import com.whitehare.hsdp.command.CeilingFanHighCommand;
import com.whitehare.hsdp.command.CeilingFanOffCommand;
import com.whitehare.hsdp.command.Command;
import com.whitehare.hsdp.command.GarageDoorOpenCommand;
import com.whitehare.hsdp.command.LightsOffCommand;
import com.whitehare.hsdp.command.LightsOnCommand;
import com.whitehare.hsdp.command.NoCommand;
import com.whitehare.hsdp.command.items.CeilingFan;
import com.whitehare.hsdp.command.items.GarageDoor;
import com.whitehare.hsdp.command.items.Light;
import com.whitehare.hsdp.command.remote.SimpleRemoteControl;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class WhenPressingButton
{
  static Logger logger = Logger.getLogger(WhenPressingButton.class);

  Command[] onCommands;
  Command[] offCommands;
  Command   undoCommand;

  Light            livingRoomLight;
  LightsOnCommand  livingRoomLightOn;
  LightsOffCommand livingRoomLightOff;

  CeilingFan            ceilingFan;
  CeilingFanHighCommand ceilingFanHigh;
  CeilingFanOffCommand  ceilingFanOff;

  @Before
  public void initializeTest()
  {
    logger.debug("Initializing Remote");

    onCommands = new Command[7];
    offCommands = new Command[7];

    Command noCommand = new NoCommand();

    for (int i = 0; i < 7; i++)
    {
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }
    undoCommand = noCommand;

    livingRoomLight = new Light("Living Room");
    livingRoomLightOn = new LightsOnCommand(livingRoomLight);
    livingRoomLightOff = new LightsOffCommand(livingRoomLight);

    setCommand(0, livingRoomLightOn, livingRoomLightOff);

    ceilingFan = new CeilingFan("Patio");
    ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
    ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

    setCommand(1, ceilingFanHigh, ceilingFanOff);

  }

  public void setCommand(int slot, Command onCommand, Command offCommand)
  {
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  public void onButtonWasPushed(int slot)
  {

    onCommands[slot].execute();
    undoCommand = onCommands[slot];
  }

  public void offButtonWasPushed(int slot)
  {
    offCommands[slot].execute();
    undoCommand = offCommands[slot];
  }

  public void undoButtonWasPushed()
  {
    undoCommand.undo();
  }

  public String toString()
  {
    return null;
  }

  @Test
  public void shouldTestRemoteLoader()
  {
    onButtonWasPushed(0);
    offButtonWasPushed(0);
    undoButtonWasPushed();
    onButtonWasPushed(1);
    offButtonWasPushed(1);
    undoButtonWasPushed();
  }

  @Test
  public void shouldTurnLightOn()
  {
    SimpleRemoteControl remote = new SimpleRemoteControl();

    Light light = new Light("Light");

    LightsOnCommand lightOn = new LightsOnCommand(light);

    remote.setCommand(lightOn);
    remote.buttonWasPressed();
  }

  @Test
  public void shouldOpenGarageDoor()
  {
    SimpleRemoteControl remote = new SimpleRemoteControl();

    GarageDoor garageDoor = new GarageDoor();

    GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
    remote.setCommand(garageDoorOpen);
    remote.buttonWasPressed();
  }

}
