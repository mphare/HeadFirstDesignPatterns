package com.whitehare.hsdp.singleton.chocolate;

public class ChocolateBoiler
{
  private static ChocolateBoiler uniqueInstance;
  private boolean                empty;
  private boolean                boiled;

  private ChocolateBoiler()
  {
    empty = true;
    boiled = false;
  }

  public static ChocolateBoiler getInstance()
  {
    if (uniqueInstance == null)
    {
      uniqueInstance = new ChocolateBoiler();
    }
    return uniqueInstance;
  }

  public void fill()
  {
    if (isEmpty())
    {
      // fill the boiler with milk and chocolate
      empty = false;
      boiled = false;
    }
  }

  public void drain()
  {
    if (!isEmpty() && isBoiled())
    {
      // drain the boiled milk and chocolate
      empty = true;
    }

  }

  public void boil()
  {
    if (!isEmpty() && !isBoiled())
    {
      // bring the contents to a boil
      boiled = true;
    }
  }

  public boolean isEmpty()
  {
    return empty;
  }

  public boolean isBoiled()
  {
    return boiled;
  }
}
