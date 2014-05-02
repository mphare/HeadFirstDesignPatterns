package com.whitehare.hsdp.factory.pizza_ingredients;

import com.whitehare.hsdp.factory.ingredients.Avocado;
import com.whitehare.hsdp.factory.ingredients.BlackOlive;
import com.whitehare.hsdp.factory.ingredients.Cheese;
import com.whitehare.hsdp.factory.ingredients.Chicken;
import com.whitehare.hsdp.factory.ingredients.Clams;
import com.whitehare.hsdp.factory.ingredients.CubedPepperoni;
import com.whitehare.hsdp.factory.ingredients.Dough;
import com.whitehare.hsdp.factory.ingredients.FlatBreadDough;
import com.whitehare.hsdp.factory.ingredients.PepperJackCheese;
import com.whitehare.hsdp.factory.ingredients.Pepperoni;
import com.whitehare.hsdp.factory.ingredients.Sauce;
import com.whitehare.hsdp.factory.ingredients.ShreddedChicken;
import com.whitehare.hsdp.factory.ingredients.Spinich;
import com.whitehare.hsdp.factory.ingredients.TomatoSauce;
import com.whitehare.hsdp.factory.ingredients.Veggies;

public class CaliforniaPizzaIngredientsFactory implements PizzaIngredientsFactory
{

  @Override
  public Dough createDough()
  {
    return new FlatBreadDough();
  }

  @Override
  public Sauce createSauce()
  {
    return new TomatoSauce();
  }

  @Override
  public Cheese createCheese()
  {
    return new PepperJackCheese();
  }

  @Override
  public Veggies[] createVeggies()
  {
    Veggies veggies[] = { new BlackOlive(), new Spinich(), new Avocado() };
    return veggies;
  }

  @Override
  public Pepperoni createPepperoni()
  {
    return new CubedPepperoni();
  }

  @Override
  public Clams createClams()
  {
    // TODO Auto-generated method stub
    return null;
  }

  public Chicken createChicken()
  {
    return new ShreddedChicken();
  }

}
