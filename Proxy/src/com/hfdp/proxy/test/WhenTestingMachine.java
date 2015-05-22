package com.hfdp.proxy.test;

import com.hfdp.proxy.GumballMachine;
import com.hfdp.proxy.monitor.GumballMonitor;

import org.junit.Test;

public class WhenTestingMachine
{

  @Test
  public void shouldExerciseMachine()
  {
    GumballMachine machine = new GumballMachine("Austin", 5);
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
    GumballMachine machine = new GumballMachine("El Paso", 5);
    System.out.println(machine);
    machine.turnCrank();
    System.out.println(machine);

  }

  @Test
  public void shouldTestMonitorWithQuarter()
  {

    GumballMachine machine = new GumballMachine("Dallas", 5);
    GumballMonitor monitor = new GumballMonitor(machine);
    machine.insertQuarter();
    monitor.report();

  }

  @Test
  public void shouldTestMonitorTurnCrank()
  {

    GumballMachine machine = new GumballMachine("Dallas", 5);
    GumballMonitor monitor = new GumballMonitor(machine);
    machine.insertQuarter();
    machine.turnCrank();
    monitor.report();

  }

  @Test
  public void shouldTestMonitorWithoutQuarter()
  {

    GumballMachine machine = new GumballMachine("Dallas", 5);
    GumballMonitor monitor = new GumballMonitor(machine);
    monitor.report();

  }

}
