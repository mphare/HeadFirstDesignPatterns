package com.hfdp.proxy;

public class HasQuarterState implements State
{

  GumballMachine gumballMachine;

  public HasQuarterState(GumballMachine gumballMachine)
  {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void ejectQuarter()
  {
    System.out.println("Quarter returned");
    gumballMachine.setState(gumballMachine.getNoQuarterState());

  }

  @Override
  public void turnCrank()
  {
    System.out.println("You turned..");
    gumballMachine.setState(gumballMachine.getSoldState());

  }

  @Override
  public void dispense()
  {
    System.out.println("No gumball dispensed");
  }

  @Override
  public void insertQuarter()
  {
    System.out.println("You cannot insert another quarter");

  }

  @Override
  public String toString()
  {
    return "Have a Quarter";
  }

}
