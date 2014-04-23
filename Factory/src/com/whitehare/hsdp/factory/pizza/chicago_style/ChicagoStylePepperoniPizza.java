package com.whitehare.hsdp.factory.pizza.chicago_style;

import com.whitehare.hsdp.factory.pizza.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza
{
  public ChicagoStylePepperoniPizza()
  {
    name = "Chicago style deep dish pizza";
    dough = "Extra thick crust dough";
    sauce = "Plum tomato sauce";

  }

  public void cut()
  {
    System.out.println("Cutting the pizza into square slices");
  }
}
