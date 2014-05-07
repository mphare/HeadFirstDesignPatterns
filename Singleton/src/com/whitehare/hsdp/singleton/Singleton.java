package com.whitehare.hsdp.singleton;

public class Singleton
{
  private static Singleton uniqueInstance;
  private int              uniqueInteger;

  private Singleton()
  {
  }

  public static Singleton getInstance()
  {
    if (uniqueInstance == null)
    {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }

  public void setUniqueInteger(int uniqueInteger)
  {
    this.uniqueInteger = uniqueInteger;

  }

  public int getUniqueInteger()
  {
    return this.uniqueInteger;
  }
}
