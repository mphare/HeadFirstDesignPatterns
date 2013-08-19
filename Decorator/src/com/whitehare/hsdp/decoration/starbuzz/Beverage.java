package com.whitehare.hsdp.decoration.starbuzz;

public abstract class Beverage {
	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();

}
