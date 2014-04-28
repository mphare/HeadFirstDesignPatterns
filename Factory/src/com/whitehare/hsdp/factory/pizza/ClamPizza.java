package com.whitehare.hsdp.factory.pizza;

import com.whitehare.hsdp.factory.pizza_ingredients.PizzaIngredientsFactory;

public class ClamPizza extends Pizza
{
  PizzaIngredientsFactory ingredientsFactory;

  public ClamPizza(PizzaIngredientsFactory ingredientsFactory)
  {
    this.ingredientsFactory = ingredientsFactory;
  }

  public void prepare()
  {
    System.out.println("Preparing " + name);
    dough = ingredientsFactory.createDough();
    sauce = ingredientsFactory.createSauce();
    cheese = ingredientsFactory.createCheese();
    clam = ingredientsFactory.createClams();

  }
}
