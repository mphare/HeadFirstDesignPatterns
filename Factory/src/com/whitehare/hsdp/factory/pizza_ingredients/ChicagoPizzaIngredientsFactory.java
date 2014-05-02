package com.whitehare.hsdp.factory.pizza_ingredients;

import com.whitehare.hsdp.factory.ingredients.BlackOlive;
import com.whitehare.hsdp.factory.ingredients.Cheese;
import com.whitehare.hsdp.factory.ingredients.Chicken;
import com.whitehare.hsdp.factory.ingredients.Clams;
import com.whitehare.hsdp.factory.ingredients.Dough;
import com.whitehare.hsdp.factory.ingredients.EggPlant;
import com.whitehare.hsdp.factory.ingredients.FrozenClams;
import com.whitehare.hsdp.factory.ingredients.MozzerellaCheese;
import com.whitehare.hsdp.factory.ingredients.Pepperoni;
import com.whitehare.hsdp.factory.ingredients.PlumTomatoSauce;
import com.whitehare.hsdp.factory.ingredients.Sauce;
import com.whitehare.hsdp.factory.ingredients.SlicedPepperoni;
import com.whitehare.hsdp.factory.ingredients.Spinich;
import com.whitehare.hsdp.factory.ingredients.ThickCrustDough;
import com.whitehare.hsdp.factory.ingredients.Veggies;

public class ChicagoPizzaIngredientsFactory implements PizzaIngredientsFactory
{

  public Dough createDough()
  {
    return new ThickCrustDough();
  }

  public Sauce createSauce()
  {
    return new PlumTomatoSauce();
  }

  public Cheese createCheese()
  {
    return new MozzerellaCheese();
  }

  public Veggies[] createVeggies()
  {
    Veggies veggies[] = { new BlackOlive(), new Spinich(), new EggPlant() };
    return veggies;
  }

  public Pepperoni createPepperoni()
  {
    return new SlicedPepperoni();
  }

  public Clams createClams()
  {
    return new FrozenClams();
  }

  @Override
  public Chicken createChicken()
  {
    // TODO Auto-generated method stub
    return null;
  }
}
