package com.hfdp.template.beverage.test;

import org.junit.Test;

import com.hfdp.template.beverage.CaffeineBeverage;
import com.hfdp.template.beverage.Coffee;
import com.hfdp.template.beverage.Tea;

public class WhenMakingBeverage
{

  @Test
  public void shouldMakeTea()
  {
    System.out.println("Making Tea");
    CaffeineBeverage myTea = new Tea();
    myTea.prepareRecipe();
  }

  @Test
  public void shouldMakeCoffee()
  {
    System.out.println("Making Coffee");
    CaffeineBeverage myCoffee = new Coffee();
    myCoffee.prepareRecipe();
  }

}
