package com.whitehare.hsdp.factory.pizza_ingredients;

import com.whitehare.hsdp.factory.ingredients.Cheese;
import com.whitehare.hsdp.factory.ingredients.Chicken;
import com.whitehare.hsdp.factory.ingredients.Clams;
import com.whitehare.hsdp.factory.ingredients.Dough;
import com.whitehare.hsdp.factory.ingredients.FreshClams;
import com.whitehare.hsdp.factory.ingredients.Garlic;
import com.whitehare.hsdp.factory.ingredients.MarinaraSauce;
import com.whitehare.hsdp.factory.ingredients.Mushroom;
import com.whitehare.hsdp.factory.ingredients.Onion;
import com.whitehare.hsdp.factory.ingredients.Pepperoni;
import com.whitehare.hsdp.factory.ingredients.RedPepper;
import com.whitehare.hsdp.factory.ingredients.ReggianoCheese;
import com.whitehare.hsdp.factory.ingredients.Sauce;
import com.whitehare.hsdp.factory.ingredients.SlicedPepperoni;
import com.whitehare.hsdp.factory.ingredients.ThinCrustDough;
import com.whitehare.hsdp.factory.ingredients.Veggies;

public class NYPizzaIngredientsFactory implements PizzaIngredientsFactory
{
  public Dough createDough()
  {
    return new ThinCrustDough();
  }

  public Sauce createSauce()
  {
    return new MarinaraSauce();
  }

  public Cheese createCheese()
  {
    return new ReggianoCheese();
  }

  public Veggies[] createVeggies()
  {
    Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    return veggies;
  }

  public Pepperoni createPepperoni()
  {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClams()
  {
    return new FreshClams();
  }

  @Override
  public Chicken createChicken()
  {
    // TODO Auto-generated method stub
    return null;
  }
}
