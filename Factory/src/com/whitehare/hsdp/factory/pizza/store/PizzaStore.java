package com.whitehare.hsdp.factory.pizza.store;

import com.whitehare.hsdp.factory.pizza.Pizza;
import com.whitehare.hsdp.factory.pizza.SimplePizzaFactory;

public abstract class PizzaStore
{
  SimplePizzaFactory factory;

  public PizzaStore(SimplePizzaFactory factory)
  {
    this.factory = factory;
  }

  public Pizza orderPizza(String type)
  {
    Pizza pizza;
    pizza = factory.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

  abstract protected Pizza createPizza(String type);

}
