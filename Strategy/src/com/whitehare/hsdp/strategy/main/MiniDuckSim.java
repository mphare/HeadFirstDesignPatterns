package com.whitehare.hsdp.strategy.main;

import com.whitehare.hsdp.strategy.Duck;
import com.whitehare.hsdp.strategy.FlyWithMotor;
import com.whitehare.hsdp.strategy.MallardDuck;
import com.whitehare.hsdp.strategy.Silent;
import com.whitehare.hsdp.strategy.model.ModelDuck;

public class MiniDuckSim
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    //
    Duck duck = new MallardDuck();
    duck.display();
    duck.performQuack();
    duck.performFly();

    //
    Duck model = new ModelDuck();
    model.display();
    model.performFly();
    model.setFlyBehavior(new FlyWithMotor());
    model.performFly();
    model.setQuackBehavior(new Silent());
    model.performQuack();

  }

}
