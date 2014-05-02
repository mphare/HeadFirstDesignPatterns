package com.whitehare.hsdp.factory.pizza.store;

import com.whitehare.hsdp.factory.pizza.CheesePizza;
import com.whitehare.hsdp.factory.pizza.ChickenPizza;
import com.whitehare.hsdp.factory.pizza.ClamPizza;
import com.whitehare.hsdp.factory.pizza.PepperoniPizza;
import com.whitehare.hsdp.factory.pizza.Pizza;
import com.whitehare.hsdp.factory.pizza.VeggiePizza;
import com.whitehare.hsdp.factory.pizza_ingredients.CaliforniaPizzaIngredientsFactory;
import com.whitehare.hsdp.factory.pizza_ingredients.PizzaIngredientsFactory;

public class CaliforniaPizzaStore extends PizzaStore
{

  @Override
  protected Pizza createPizza(String type)
  {
    Pizza pizza = null;
    PizzaIngredientsFactory ingredientsFactory = new CaliforniaPizzaIngredientsFactory();
    if (type.equals("cheese"))
    {
      pizza = new CheesePizza(ingredientsFactory);
      pizza.setName("California Style Cheese Pizza");
    } else if (type.equals("pepperoni"))
    {
      pizza = new PepperoniPizza(ingredientsFactory);
      pizza.setName("California Style Pepperoni Pizza");
    } else if (type.equals("clam"))
    {
      pizza = new ClamPizza(ingredientsFactory);
      pizza.setName("California Style Clam Pizza");
    } else if (type.equals("veggie"))
    {
      pizza = new VeggiePizza(ingredientsFactory);
      pizza.setName("California Style Veggie Pizza");
    } else if (type.equals("chicken"))
    {
      pizza = new ChickenPizza(ingredientsFactory);
      pizza.setName("California Chicken Pizza");
    }
    return pizza;

  }

}
