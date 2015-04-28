package com.whitehare.hsdp.state;

public class WinnerState implements State
{

  GumballMachine gumballMachine;

  public WinnerState(GumballMachine gumballMachine)
  {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void ejectQuarter()
  {
    // TODO Auto-generated method stub

  }

  @Override
  public void turnCrank()
  {
    // TODO Auto-generated method stub

  }

  @Override
  public void dispence()
  {
    System.out.println("You're a Winner! You get TWO gumballs for your quarter");

  }

  @Override
  public void insertQuarter()
  {
    // TODO Auto-generated method stub

  }

}
