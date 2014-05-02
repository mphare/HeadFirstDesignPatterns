package com.whitehare.hsdp.factory.pizza.test;

import org.junit.Test;

import com.whitehare.hsdp.factory.pizza.store.CaliforniaPizzaStore;
import com.whitehare.hsdp.factory.pizza.store.PizzaStore;

public class WhenBuildingCaliforniaPizza
{

  @Test
  public void buildCaliforniaPizza()
  {
    PizzaStore pizzaStore = new CaliforniaPizzaStore();
    pizzaStore.orderPizza("cheese");
    pizzaStore.orderPizza("pepperoni");
    pizzaStore.orderPizza("veggie");
    pizzaStore.orderPizza("chicken");
  }

}
