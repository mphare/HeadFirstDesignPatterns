package com.hfdp.proxy;

public class NoQuarterState implements State
{
  GumballMachine gumballMachine;

  @Override
  public void insertQuarter()
  {
    System.out.println("You inserted a quarter");
    gumballMachine.setState(gumballMachine.getHasQuarterState());
  }

  public NoQuarterState(GumballMachine gumballMachine)
  {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void ejectQuarter()
  {
    System.out.println("You have not inserted a quarter");

  }

  @Override
  public void turnCrank()
  {
    System.out.println("You turned the crank, but have not inserted a quarter");

  }

  @Override
  public void dispence()
  {
    System.out.println("You need to pay first");

  }

}
