package com.whitehare.hsdp.command.test;

import org.junit.Test;

import com.whitehare.hsdp.command.GarageDoorOpenCommand;
import com.whitehare.hsdp.command.LightsOnCommand;
import com.whitehare.hsdp.command.items.GarageDoor;
import com.whitehare.hsdp.command.items.Light;
import com.whitehare.hsdp.command.remote.SimpleRemoteControl;

public class WhenPressingButton
{

  @Test
  public void shouldTurnLightOn()
  {
    SimpleRemoteControl remote = new SimpleRemoteControl();

    Light light = new Light();

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
