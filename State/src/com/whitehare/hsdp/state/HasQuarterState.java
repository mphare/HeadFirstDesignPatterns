package com.whitehare.hsdp.state;

import java.util.Random;

public class HasQuarterState implements State
{
  Random         randomWinner = new Random(System.currentTimeMillis());

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
    int winner = randomWinner.nextInt(10);
    System.out.println("Winner? :" + winner);
    if ((winner == 3) && (gumballMachine.getCount() > 1))
    {
      gumballMachine.setState(gumballMachine.getWinnerState());
    } else
    {
      gumballMachine.setState(gumballMachine.getSoldState());
    }

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
