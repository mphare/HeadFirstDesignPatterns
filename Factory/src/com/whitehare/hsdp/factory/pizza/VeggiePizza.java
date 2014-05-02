package com.whitehare.hsdp.factory.pizza;

import com.whitehare.hsdp.factory.ingredients.Veggies;
import com.whitehare.hsdp.factory.pizza_ingredients.PizzaIngredientsFactory;

public class VeggiePizza extends Pizza
{
  PizzaIngredientsFactory ingredientsFactory;

  public VeggiePizza(PizzaIngredientsFactory ingredientsFactory)
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
    veggies = ingredientsFactory.createVeggies();
    for (Veggies veggie : veggies)
    {
      System.out.println("Veggie: " + veggie.getName());
    }
  }
}
