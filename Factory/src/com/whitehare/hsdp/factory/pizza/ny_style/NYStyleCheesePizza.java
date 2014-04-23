package com.whitehare.hsdp.factory.pizza.ny_style;

import com.whitehare.hsdp.factory.pizza.CheesePizza;

public class NYStyleCheesePizza extends CheesePizza
{

  public NYStyleCheesePizza()
  {
    name = "New York Style Cheese Pizza";
    dough = "Thin crust dough";
    sauce = "Marinara sauce";

    toppings.add("Grated reggiano cheese");
  }
}
