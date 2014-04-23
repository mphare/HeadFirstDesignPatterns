package com.whitehare.hsdp.factory.pizza.test;

import org.junit.Test;

import com.whitehare.hsdp.factory.pizza.store.ChicagoStylePizzaStore;
import com.whitehare.hsdp.factory.pizza.store.PizzaStore;

public class WhenBuildingChicagoPizza
{

  @Test
  public void buildChicagoCheesePizza()
  {
    PizzaStore pizzaStore = new ChicagoStylePizzaStore();
    pizzaStore.orderPizza("cheese");
    pizzaStore.orderPizza("pepperoni");
    pizzaStore.orderPizza("veggie");
  }
}
