package com.whitehare.hsdp.state;

public class SoldState implements State
{

  GumballMachine gumballMachine;

  public SoldState(GumballMachine gumballMachine)
  {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void ejectQuarter()
  {
    System.out.println("You already turned the crank");

  }

  @Override
  public void turnCrank()
  {
    System.out.println("Turning the crank twice will get you nowhere");

  }

  @Override
  public void dispence()
  {
    gumballMachine.releaseBall();
    if (gumballMachine.getCount() > 0)
    {
      gumballMachine.setState(gumballMachine.getNoQuarterState());

    } else
    {
      System.out.println("Oops, out of gumballs");
      gumballMachine.setState(gumballMachine.getSoldOutState());
    }

  }

  @Override
  public void insertQuarter()
  {
    System.out.println("Please wait, we are already dispensing a gumball");
  }

}
