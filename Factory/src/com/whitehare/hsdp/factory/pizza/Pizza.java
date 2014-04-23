package com.whitehare.hsdp.factory.pizza;

import java.util.ArrayList;

public abstract class Pizza
{
  protected String    name;
  protected String    dough;
  protected String    sauce;
  protected ArrayList toppings = new ArrayList();

  public void prepare()
  {
    System.out.println("Preparing " + name);
    System.out.println("Dough: " + dough);
    System.out.println("Sauce: " + sauce);

  }

  public void bake()
  {
    System.out.println("Bake for 25 minutes at 350");
  }

  public void cut()
  {
    System.out.println("Cutting the pizza into diagonal slices");

  }

  public void box()
  {
    System.out.println("Place pizza in official Pizzastore box");

  }

  public String getName()
  {
    return name;
  }

}
