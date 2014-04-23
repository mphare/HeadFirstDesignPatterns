package com.whitehare.hsdp.factory.pizza.ny_style;

import com.whitehare.hsdp.factory.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza
{

  public NYStyleCheesePizza()
  {
    name = "New York Style Cheese Pizza";
    dough = "Thin crust dough";
    sauce = "Marinara sauce";

    toppings.add("Grated reggiano cheese");
  }
}
