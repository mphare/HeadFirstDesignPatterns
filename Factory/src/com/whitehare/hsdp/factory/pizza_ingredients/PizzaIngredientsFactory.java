package com.whitehare.hsdp.factory.pizza_ingredients;

import com.whitehare.hsdp.factory.ingredients.Cheese;
import com.whitehare.hsdp.factory.ingredients.Clams;
import com.whitehare.hsdp.factory.ingredients.Dough;
import com.whitehare.hsdp.factory.ingredients.Pepperoni;
import com.whitehare.hsdp.factory.ingredients.Sauce;
import com.whitehare.hsdp.factory.ingredients.Veggies;

public interface PizzaIngredientsFactory
{
  public Dough createDough();

  public Sauce createSauce();

  public Cheese createCheese();

  public Veggies[] createVeggies();

  public Pepperoni createPepperoni();

  public Clams createClams();

}
