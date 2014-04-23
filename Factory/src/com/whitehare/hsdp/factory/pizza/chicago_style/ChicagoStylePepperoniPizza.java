package com.whitehare.hsdp.factory.pizza.chicago_style;

import com.whitehare.hsdp.factory.pizza.PepperoniPizza;

public class ChicagoStylePepperoniPizza extends PepperoniPizza
{
  public ChicagoStylePepperoniPizza()
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
