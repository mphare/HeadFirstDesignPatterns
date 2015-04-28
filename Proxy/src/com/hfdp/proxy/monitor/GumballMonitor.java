package com.hfdp.proxy.monitor;

import com.hfdp.proxy.GumballMachine;

public class GumballMonitor
{
  GumballMachine machine;

  public GumballMonitor(GumballMachine machine)
  {
    this.machine = machine;
  }

  public void report()
  {
    System.out.println("Gumball Machine: " + machine.getLocation());
    System.out.println("current inventory: " + machine.getCount() + " gumballs");
    System.out.println("Current state: " + machine.getState());
  }
}
