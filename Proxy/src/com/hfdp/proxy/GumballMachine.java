package com.hfdp.proxy;

public class GumballMachine
{
  String location;

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

  public void setHasQuarterState(State hasQuarterState)
  {
    this.hasQuarterState = hasQuarterState;
  }

  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;

  State state = soldOutState;

  public State getState()
  {
    return state;
  }

  int count = 0;

  public int getCount()
  {
    return count;
  }

  public GumballMachine(String location, int numberOfGumballs)
  {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    this.location = location;
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
    state.dispence();
  }

  void setState(State state)
  {
    this.state = state;

  }

  public String getLocation()
  {
    return this.location;
  }

  void releaseBall()
  {
    System.out.println("A gumball comes rolling out the slot...");
    if (count != 0)
      count = count - 1;
  }

  public Object getHasQuarterState()
  {
    // TODO Auto-generated method stub
    return null;
  }

  public void setState(Object hasQuarterState)
  {
    // TODO Auto-generated method stub

  }

}
