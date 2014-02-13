package com.whitehare.hsdp.strategy.model;

import com.whitehare.hsdp.strategy.Duck;
import com.whitehare.hsdp.strategy.FlyNoWay;
import com.whitehare.hsdp.strategy.Quack;
import com.whitehare.hsdp.strategy.WebbedFoot;

public class ModelDuck extends Duck
{

  public ModelDuck()
  {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
    footType = new WebbedFoot();
  }

  @Override
  public void display()
  {
    System.out.println("I'm a model duck");
  }

}
