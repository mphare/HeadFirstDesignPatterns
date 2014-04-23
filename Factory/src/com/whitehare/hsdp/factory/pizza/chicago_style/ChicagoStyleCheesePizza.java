package com.whitehare.hsdp.factory.pizza.chicago_style;

import com.whitehare.hsdp.factory.pizza.CheesePizza;

public class ChicagoStyleCheesePizza extends CheesePizza
{
  public ChicagoStyleCheesePizza()
  {
    name = "Chicago style deep dish pizza";
    dough = "Extra thick crust dough";
    sauce = "Plum tomato sauce";
    toppings.add("Shredded mozzarella cheese");
  }

  public void cut()
  {
    System.out.println("Cutting the pizza into square slices");
  }
}
