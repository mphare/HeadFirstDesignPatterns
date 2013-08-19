package com.whitehare.hsdp.factory.pizza.store;

import com.whitehare.hsdp.factory.pizza.Pizza;
import com.whitehare.hsdp.factory.pizza.SimplePizzaFactory;
import com.whitehare.hsdp.factory.pizza.ny_style.NYStyleCheesePizza;
import com.whitehare.hsdp.factory.pizza.ny_style.NYStyleClamPizza;
import com.whitehare.hsdp.factory.pizza.ny_style.NYStylePepperoniPizza;
import com.whitehare.hsdp.factory.pizza.ny_style.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore
{

  public NYStylePizzaStore(SimplePizzaFactory factory)
  {
    super(factory);
    // TODO Auto-generated constructor stub
  }

  @Override
  public Pizza createPizza(String type)
  {

    if (type.equals("cheese"))
    {
      return new NYStyleCheesePizza();
    } else if (type.equals("pepperoni"))
    {
      return new NYStylePepperoniPizza();
    } else if (type.equals("clam"))
    {
      return new NYStyleClamPizza();
    } else if (type.equals("veggie"))
    {
      return new NYStyleVeggiePizza();
    }
    return null;

  }

}
