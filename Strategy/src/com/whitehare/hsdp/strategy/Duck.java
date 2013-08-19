package com.whitehare.hsdp.strategy;

abstract public class Duck {
	protected QuackBehavior quackBehavior;
	protected FlyBehavior flyBehavior;

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void swim() {
		System.out.println("All ducks swim");

	}

	abstract public void display();
}
