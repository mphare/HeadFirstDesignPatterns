package com.whitehare.hsdp.factory.pizza.test;

import org.junit.Test;

import com.whitehare.hsdp.factory.pizza.store.NYStylePizzaStore;
import com.whitehare.hsdp.factory.pizza.store.PizzaStore;

public class WhenBuildingNYPizza
{

  @Test
  public void buildNYCheesePizza()
  {
    PizzaStore pizzaStore = new NYStylePizzaStore();
    pizzaStore.orderPizza("cheese");
    pizzaStore.orderPizza("clam");
    pizzaStore.orderPizza("pepperoni");
    pizzaStore.orderPizza("veggie");
  }

}
