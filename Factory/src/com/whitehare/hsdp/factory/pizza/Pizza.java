package com.whitehare.hsdp.factory.pizza;

import com.whitehare.hsdp.factory.ingredients.Cheese;
import com.whitehare.hsdp.factory.ingredients.Chicken;
import com.whitehare.hsdp.factory.ingredients.Clams;
import com.whitehare.hsdp.factory.ingredients.Dough;
import com.whitehare.hsdp.factory.ingredients.Pepperoni;
import com.whitehare.hsdp.factory.ingredients.Sauce;
import com.whitehare.hsdp.factory.ingredients.Veggies;

public abstract class Pizza
{
  protected String name;
  Dough            dough;
  Sauce            sauce;
  Veggies          veggies[];
  Cheese           cheese;
  Pepperoni        pepperoni;
  Clams            clam;
  Chicken          chicken;

  public abstract void prepare();

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

  public void setName(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public String toString()
  {
    // code to print pizza here
    return "Not Yet";
  }
}
