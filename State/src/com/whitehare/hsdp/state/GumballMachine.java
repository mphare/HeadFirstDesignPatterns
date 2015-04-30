package com.whitehare.hsdp.state;

public class GumballMachine
{
  State        soldState;
  State        winnerState;
  State        soldOutState;
  State        noQuarterState;
  State        hasQuarterState;

  State        state       = soldOutState;
  int          count       = 0;
  final String company     = "Mighty Gumball, Inc.";
  final String description = "Java-enabled Standing Gumball Model #2004";

  @Override
  public String toString()
  {
    String d = company + "\n" + description + "\n" + "Inventory " + count + " gumballs" + "\n" + state.toString();

    return (d);
  }

  public int getCount()
  {
    return count;
  }

  public GumballMachine(int numberOfGumballs)
  {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    winnerState = new WinnerState(this);
    this.count = numberOfGumballs;
    if (numberOfGumballs > 0)
      state = noQuarterState;
  }

  public void insertQuarter()
  {
    state.insertQuarter();
  }

  public void ejectQuarter()
  {
    state.ejectQuarter();
  }

  public void turnCrank()
  {
    state.turnCrank();
    state.dispense();
  }

  public void setState(State state)
  {
    this.state = state;

  }

  public State getState()
  {
    return this.state;
  }

  void releaseBall()
  {
    System.out.println("A gumball comes rolling out the slot...");
    if (count != 0)
      count = count - 1;
  }

  public State getWinnerState()
  {
    return winnerState;
  }

  public void setWinnerState(State winnerState)
  {
    this.winnerState = winnerState;
  }

  public State getHasQuarterState()
  {
    return hasQuarterState;
  }

  public void setHasQuarterState(State hasQuarterState)
  {
    this.hasQuarterState = hasQuarterState;
  }

  public State getSoldOutState()
  {
    return soldOutState;
  }

  public void setSoldOutState(State soldOutState)
  {
    this.soldOutState = soldOutState;
  }

  public State getNoQuarterState()
  {
    return noQuarterState;
  }

  public void setNoQuarterState(State noQuarterState)
  {
    this.noQuarterState = noQuarterState;
  }

  public State getSoldState()
  {
    return soldState;
  }

  public void setSoldState(State soldState)
  {
    this.soldState = soldState;
  }

}
