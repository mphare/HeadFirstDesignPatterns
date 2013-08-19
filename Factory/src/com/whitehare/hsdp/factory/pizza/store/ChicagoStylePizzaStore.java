package com.whitehare.hsdp.factory.pizza.store;

import com.whitehare.hsdp.factory.pizza.Pizza;
import com.whitehare.hsdp.factory.pizza.SimplePizzaFactory;
import com.whitehare.hsdp.factory.pizza.chicago_style.ChicagoStyleCheesePizza;
import com.whitehare.hsdp.factory.pizza.chicago_style.ChicagoStyleClamPizza;
import com.whitehare.hsdp.factory.pizza.chicago_style.ChicagoStylePepperoniPizza;
import com.whitehare.hsdp.factory.pizza.chicago_style.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore
{

  public ChicagoStylePizzaStore(SimplePizzaFactory factory)
  {
    super(factory);
    // TODO Auto-generated constructor stub
  }

  public Pizza createPizza(String type)
  {
    if (type.equals("cheese"))
    {
      return new ChicagoStyleCheesePizza();
    } else if (type.equals("pepperoni"))
    {
      return new ChicagoStylePepperoniPizza();
    } else if (type.equals("clam"))
    {
      return new ChicagoStyleClamPizza();
    } else if (type.equals("veggie"))
    {
      return new ChicagoStyleVeggiePizza();
    }
    return null;
  }

}
