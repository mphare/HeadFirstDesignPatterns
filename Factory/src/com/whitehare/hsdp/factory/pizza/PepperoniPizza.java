package com.whitehare.hsdp.factory.pizza;

import com.whitehare.hsdp.factory.pizza_ingredients.PizzaIngredientsFactory;

public class PepperoniPizza extends Pizza
{
  PizzaIngredientsFactory ingredientsFactory;

  public PepperoniPizza(PizzaIngredientsFactory ingredientsFactory)
  {
    this.ingredientsFactory = ingredientsFactory;
  }

  public void prepare()
  {
    System.out.println("\nPreparing " + name);
    dough = ingredientsFactory.createDough();
    System.out.println("Dough: " + dough.getName());

    sauce = ingredientsFactory.createSauce();
    System.out.println("Sauce: " + sauce.getName());

    cheese = ingredientsFactory.createCheese();
    System.out.println("Cheese: " + cheese.getName());

    pepperoni = ingredientsFactory.createPepperoni();
    System.out.println("Pepperoni: " + pepperoni.getName());
  }
}
