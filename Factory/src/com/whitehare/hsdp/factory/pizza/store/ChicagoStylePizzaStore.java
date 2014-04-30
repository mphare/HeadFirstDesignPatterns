package com.whitehare.hsdp.factory.pizza.store;

import com.whitehare.hsdp.factory.pizza.CheesePizza;
import com.whitehare.hsdp.factory.pizza.ClamPizza;
import com.whitehare.hsdp.factory.pizza.PepperoniPizza;
import com.whitehare.hsdp.factory.pizza.Pizza;
import com.whitehare.hsdp.factory.pizza.VeggiePizza;
import com.whitehare.hsdp.factory.pizza_ingredients.ChicagoPizzaIngredientsFactory;
import com.whitehare.hsdp.factory.pizza_ingredients.PizzaIngredientsFactory;

public class ChicagoStylePizzaStore extends PizzaStore
{

  public Pizza createPizza(String type)
  {
    Pizza pizza = null;
    PizzaIngredientsFactory ingredientsFactory = new ChicagoPizzaIngredientsFactory();
    if (type.equals("cheese"))
    {
      pizza = new CheesePizza(ingredientsFactory);
      pizza.setName("Chicago Style Cheese Pizza");
    } else if (type.equals("pepperoni"))
    {
      pizza = new PepperoniPizza(ingredientsFactory);
      pizza.setName("Chicago Style Pepperoni Pizza");
    } else if (type.equals("clam"))
    {
      pizza = new ClamPizza(ingredientsFactory);
      pizza.setName("Chicago Style Clam Pizza");
    } else if (type.equals("veggie"))
    {
      pizza = new VeggiePizza(ingredientsFactory);
      pizza.setName("Chicago Style Veggie Pizza");
    }
    return pizza;
  }

}
