package com.whitehare.hsdp.factory.pizza.test;

import org.junit.Test;

import com.whitehare.hsdp.factory.pizza.store.ChicagoStylePizzaStore;
import com.whitehare.hsdp.factory.pizza.store.PizzaStore;

public class WhenChicagoPizza
{

  @Test
  public void buildNYCheesePizza()
  {
    PizzaStore pizzaStore = new ChicagoStylePizzaStore();
    pizzaStore.orderPizza("cheese");
    pizzaStore.orderPizza("clam");
    pizzaStore.orderPizza("pepperoni");
    pizzaStore.orderPizza("veggie");
  }

}
