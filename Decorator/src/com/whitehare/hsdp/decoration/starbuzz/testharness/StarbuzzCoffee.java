package com.whitehare.hsdp.decoration.starbuzz.testharness;

import com.whitehare.hsdp.decoration.starbuzz.Beverage;
import com.whitehare.hsdp.decoration.starbuzz.DarkRoast;
import com.whitehare.hsdp.decoration.starbuzz.Espresso;
import com.whitehare.hsdp.decoration.starbuzz.Mocha;
import com.whitehare.hsdp.decoration.starbuzz.Whip;

public class StarbuzzCoffee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beverage beverage = new Espresso();

		System.out.println("Desc: " + beverage.getDescription() + " for $"
				+ beverage.cost());

		Beverage bev2 = new DarkRoast();
		bev2 = new Mocha(bev2);
		bev2 = new Mocha(bev2);
		bev2 = new Whip(bev2);

		System.out.println("Desc: " + bev2.getDescription() + " for $"
				+ bev2.cost());
	}
}
