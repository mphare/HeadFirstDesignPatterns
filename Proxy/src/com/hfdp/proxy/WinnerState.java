package com.hfdp.proxy;

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
    System.out.println("Winner, Winner, Chicken Dinner! You get TWO gumballs for your quarter");
    gumballMachine.releaseBall();
    if (gumballMachine.getCount() == 0)
    {
      gumballMachine.setState(gumballMachine.getSoldOutState());
    } else
    {
      gumballMachine.releaseBall();
      if (gumballMachine.getCount() > 0)
      {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
      } else
      {
        System.out.println("Oops, out of gumballs!");
        gumballMachine.setState(gumballMachine.getSoldOutState());
      }
    }
  }

  @Override
  public void insertQuarter()
  {
    System.out.println("Please wait, we are already dispensing a gumball");

  }

}
