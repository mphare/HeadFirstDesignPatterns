package com.whitehare.hsdp.strategy;

public class MallardDuck extends Duck
{
  public MallardDuck()
  {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
    footType = new WebbedFoot();
  }

  public void display()
  {
    System.out.println("I'm a Mallard Duck");
  }

}
