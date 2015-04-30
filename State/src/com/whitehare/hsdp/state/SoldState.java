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
    System.out.println("Cannot eject the quarter, you've already bought a gumball!");

  }

  @Override
  public void turnCrank()
  {
    System.out.println("Turning the crank twice will get you nowhere");

  }

  @Override
  public void dispense()
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
