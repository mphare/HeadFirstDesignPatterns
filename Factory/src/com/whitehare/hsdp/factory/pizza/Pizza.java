package com.whitehare.hsdp.factory.pizza;

import java.util.ArrayList;

public abstract class Pizza
{
  protected String name;
  String           dough;
  String           sauce;
  ArrayList        toppings = new ArrayList();

  public void prepare()
  {
    System.out.println("Preparing " + name);

  }

  public void bake()
  {
    System.out.println("Bake for 25 minutes at 350");
  }

  public void cut()
  {

  }

  public void box()
  {

  }

  public String getName()
  {
    return name;
  }

}
