package com.hfdp.proxy.test;

import org.junit.Test;

import com.hfdp.proxy.GumballMachine;
import com.hfdp.proxy.monitor.GumballMonitor;

public class WhenTestingMachine
{

  @Test
  public void shouldCycleMachine()
  {
    GumballMachine machine = new GumballMachine("Austin", 15);
    System.out.println(machine);
    machine.insertQuarter();
    machine.turnCrank();
    System.out.println(machine);

  }

  @Test
  public void shouldMonitorValues()
  {
    int count = 0;

    GumballMachine machine = new GumballMachine("Texas", 120);
    GumballMonitor monitor = new GumballMonitor(machine);

    monitor.report();
  }

}
