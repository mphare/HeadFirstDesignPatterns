package com.whitehare.hsdp.singleton;

import org.apache.log4j.Logger;

public class Singleton
{
  private static Singleton uniqueInstance;
  private        int       uniqueInteger;
  static Logger log4j = Logger.getLogger(Singleton.class);

  private Singleton()
  {
  }

  public static Singleton getInstance()
  {
    if (uniqueInstance == null)
    {
      log4j.debug("Creating Singleton");
      uniqueInstance = new Singleton();
    }
    log4j.debug("Returning Instance");
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
