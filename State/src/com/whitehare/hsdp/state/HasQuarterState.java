package com.whitehare.hsdp.state;

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

  }

  @Override
  public void dispence()
  {

  }

  @Override
  public void insertQuarter()
  {
    System.out.println("You cannot insert another quarter");

  }

}
