package com.whitehare.hsdp.strategy.model;

import com.whitehare.hsdp.strategy.Duck;
import com.whitehare.hsdp.strategy.FlyNoWay;
import com.whitehare.hsdp.strategy.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}

}
