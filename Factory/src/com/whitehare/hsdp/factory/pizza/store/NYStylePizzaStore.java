package com.whitehare.hsdp.factory.pizza.store;

import com.whitehare.hsdp.factory.pizza.CheesePizza;
import com.whitehare.hsdp.factory.pizza.ClamPizza;
import com.whitehare.hsdp.factory.pizza.PepperoniPizza;
import com.whitehare.hsdp.factory.pizza.Pizza;
import com.whitehare.hsdp.factory.pizza.VeggiePizza;
import com.whitehare.hsdp.factory.pizza_ingredients.NYPizzaIngredientsFactory;
import com.whitehare.hsdp.factory.pizza_ingredients.PizzaIngredientsFactory;

public class NYStylePizzaStore extends PizzaStore
{

  protected Pizza createPizza(String type)
  {
    Pizza pizza = null;
    PizzaIngredientsFactory ingredientsFactory = new NYPizzaIngredientsFactory();
    if (type.equals("cheese"))
    {
      pizza = new CheesePizza(ingredientsFactory);
      pizza.setName("New York Style Cheese Pizza");
    } else if (type.equals("pepperoni"))
    {
      pizza = new PepperoniPizza(ingredientsFactory);
      pizza.setName("New York Style Pepperoni Pizza");
    } else if (type.equals("clam"))
    {
      pizza = new ClamPizza(ingredientsFactory);
      pizza.setName("New York Style Clam Pizza");
    } else if (type.equals("veggie"))
    {
      pizza = new VeggiePizza(ingredientsFactory);
      pizza.setName("New York Style Veggie Pizza");
    }
    return pizza;

  }

}
