package com.whitehare.hsdp.factory.pizza.test;

import org.junit.Test;

import com.whitehare.hsdp.factory.pizza.SimplePizzaFactory;
import com.whitehare.hsdp.factory.pizza.store.ChicagoStylePizzaStore;
import com.whitehare.hsdp.factory.pizza.store.PizzaStore;

public class WhenBuildingChicagoPizza
{

  @Test
  public void buildChicagoCheesePizza()
  {
    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore pizzaStore = new ChicagoStylePizzaStore(factory);
    pizzaStore.orderPizza("cheese");
    pizzaStore.orderPizza("pepperoni");

  }

}
