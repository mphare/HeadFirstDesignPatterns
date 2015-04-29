package com.hfdp.proxy.test;

import org.junit.Test;

import com.hfdp.proxy.GumballMachine;
import com.hfdp.proxy.monitor.GumballMonitor;

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
  public void shouldTestMonitor()
  {

    GumballMachine machine = new GumballMachine("Tester", 5);
    GumballMonitor monitor = new GumballMonitor(machine);
    machine.insertQuarter();
    monitor.report();

  }

}
