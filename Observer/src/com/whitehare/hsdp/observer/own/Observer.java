package com.whitehare.hsdp.observer.own;

public interface Observer {
	public void update(float temp, float humidity, float presure,
			float heatIndex);

}
