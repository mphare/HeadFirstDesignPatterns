package com.whitehare.hsdp.state;

public class SoldOutState implements State
{
  GumballMachine gumballMachine;

  public SoldOutState(GumballMachine gumballMachine)
  {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void ejectQuarter()
  {
    System.out.println("Sorry, we are sold out of gumballs");
  }

  @Override
  public void turnCrank()
  {
    System.out.println("Sorry, we are sold out of gumballs");
  }

  @Override
  public void dispence()
  {
    System.out.println("Sorry, we are sold out of gumballs");
  }

  @Override
  public void insertQuarter()
  {
    System.out.println("Sorry, we are sold out of gumballs");
  }

}
