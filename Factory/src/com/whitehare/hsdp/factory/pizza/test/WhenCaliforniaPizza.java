package com.whitehare.hsdp.factory.pizza.test;

import org.junit.Test;

import com.whitehare.hsdp.factory.pizza.store.CaliforniaPizzaStore;
import com.whitehare.hsdp.factory.pizza.store.PizzaStore;

public class WhenCaliforniaPizza
{

  @Test
  public void buildNYCheesePizza()
  {
    PizzaStore pizzaStore = new CaliforniaPizzaStore();
    pizzaStore.orderPizza("cheese");
    pizzaStore.orderPizza("clam");
    pizzaStore.orderPizza("pepperoni");
    pizzaStore.orderPizza("veggie");
  }

}
