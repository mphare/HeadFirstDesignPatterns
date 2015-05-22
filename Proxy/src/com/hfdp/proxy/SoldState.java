package com.hfdp.proxy;

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
    // TODO Auto-generated method stub

  }

  @Override
  public void dispense()
  {
    // TODO Auto-generated method stub

  }

  @Override
  public void insertQuarter()
  {
    // TODO Auto-generated method stub

  }

  @Override
  public String toString()
  {
    return "Sold a Gumball";
  }
}
