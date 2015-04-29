package com.whitehare.hsdp.state.test;

import org.junit.Test;

import com.whitehare.hsdp.state.GumballMachine;
import com.whitehare.hsdp.state.State;

public class WhenTestingMachine
{

  @Test
  public void shouldExerciseMachine()
  {
    GumballMachine machine = new GumballMachine(5);
    System.out.println(machine);
    machine.insertQuarter();
    machine.turnCrank();
    System.out.println(machine);
    machine.insertQuarter();
    machine.turnCrank();
    machine.insertQuarter();
    machine.turnCrank();
    machine.insertQuarter();
    machine.turnCrank();
    machine.insertQuarter();
    machine.turnCrank();
    System.out.println(machine);
  }

  @Test
  public void shouldRejectCrankWithoutQuarter()
  {
    GumballMachine machine = new GumballMachine(5);
    System.out.println(machine);
    machine.turnCrank();
    System.out.println(machine);
    State state = machine.getState();
    System.out.println("State: " + state);

  }

}
