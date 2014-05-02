package com.whitehare.hsdp.factory.pizza;

import com.whitehare.hsdp.factory.pizza_ingredients.PizzaIngredientsFactory;

public class ChickenPizza extends Pizza
{
  PizzaIngredientsFactory ingredientsFactory;

  public ChickenPizza(PizzaIngredientsFactory ingredientsFactory)
  {
    this.ingredientsFactory = ingredientsFactory;
  }

  @Override
  public void prepare()
  {
    System.out.println("\nPreparing " + name);
    dough = ingredientsFactory.createDough();
    System.out.println("Dough: " + dough.getName());
    sauce = ingredientsFactory.createSauce();
    System.out.println("Sauce: " + sauce.getName());
    cheese = ingredientsFactory.createCheese();
    System.out.println("Cheese: " + cheese.getName());
    chicken = ingredientsFactory.createChicken();
    System.out.println("Chicken: " + chicken.getName());

  }

}
