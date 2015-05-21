package com.whitehare.hsdp.strategy;

abstract public class Duck
{
  protected QuackBehavior quackBehavior;
  protected FlyBehavior   flyBehavior;
  protected FootType      footType;

  public void setFootType(FootType ft)
  {
    footType = ft;
  }

  public void setFlyBehavior(FlyBehavior fb)
  {
    flyBehavior = fb;
  }

  public void setQuackBehavior(QuackBehavior qb)
  {
    quackBehavior = qb;
  }

  public void performQuack()
  {
    quackBehavior.quack();
  }

  public void performFly()
  {
    flyBehavior.fly();
  }

  public void performFoot()
  {
    footType.foot();
  }

  public void swim()
  {

    System.out.println("All ducks swim");

  }

  abstract public void display();
}
