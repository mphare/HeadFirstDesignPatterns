package com.whitehare.hsdp.state.test;

import org.junit.Test;

import com.whitehare.hsdp.state.GumballMachine;

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
  public void shouldExerciseSoldOutMachine()
  {
    GumballMachine machine = new GumballMachine(5);
    System.out.println(machine);
    machine.insertQuarter();
    machine.turnCrank();
    machine.insertQuarter();
    machine.turnCrank();
    machine.insertQuarter();
    machine.turnCrank();
    machine.insertQuarter();
    machine.turnCrank();
    machine.insertQuarter();
    machine.turnCrank();
    machine.insertQuarter();
    machine.turnCrank();
  }

  @Test
  public void shouldRejectCrankWithoutQuarter()
  {
    GumballMachine machine = new GumballMachine(5);
    System.out.println(machine);
    machine.turnCrank();

  }

  @Test
  public void shouldRejectInsertTwoQuarters()
  {
    GumballMachine machine = new GumballMachine(5);
    System.out.println(machine);
    machine.insertQuarter();
    machine.insertQuarter();

  }

  @Test
  public void shouldEjectQuarter()
  {
    GumballMachine machine = new GumballMachine(5);
    System.out.println(machine);
    machine.insertQuarter();
    machine.ejectQuarter();

  }
}
