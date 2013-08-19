package com.whitehare.hsdp.factory.pizza.test;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.whitehare.hsdp.factory.pizza.SimplePizzaFactory;
import com.whitehare.hsdp.factory.pizza.store.NYStylePizzaStore;
import com.whitehare.hsdp.factory.pizza.store.PizzaStore;

public class WhenBuildingNYPizza
{

  @Test
  public void buildNYCheesePizza()
  {
    SimplePizzaFactory factory = new SimplePizzaFactory();
    factory.createPizza("cheese");
    PizzaStore pizzaStore = new NYStylePizzaStore(factory);
    pizzaStore.orderPizza("cheese");
    fail("Not yet implemented");
  }
}
