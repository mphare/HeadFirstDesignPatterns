package com.whitehare.hsdp.factory.pizza.chicago_style;

import com.whitehare.hsdp.factory.pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza
{
  public ChicagoStyleCheesePizza()
  {
    name = "Chicago style deep dish pizza";
    dough = "Extra thick crust dough";
    sauce = "Plum tomato sauce";
    toppings.add("Shredded mozzarella cheese");
  }

  @Override
  public void cut()
  {
    System.out.println("Cutting the pizza into square slices");
  }
}
