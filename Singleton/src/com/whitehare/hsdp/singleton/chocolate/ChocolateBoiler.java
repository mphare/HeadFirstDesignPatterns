package com.whitehare.hsdp.singleton.chocolate;

import org.apache.log4j.Logger;

public class ChocolateBoiler
{
  static Logger                  log4j = Logger.getLogger(ChocolateBoiler.class);
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
      log4j.debug("Empty, so fill");
      // fill the boiler with milk and chocolate
      empty = false;
      boiled = false;
    }
  }

  public void drain()
  {
    if (!isEmpty() && isBoiled())
    {
      log4j.debug("Not empty and done, so drain");
      // drain the boiled milk and chocolate
      empty = true;
    }

  }

  public void boil()
  {
    if (!isEmpty() && !isBoiled())
    {
      log4j.debug("Not empty and not done, so boil");

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
