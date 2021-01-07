package com.qa.garage;

public class Car extends Vehicle {

	private String engine = "";
	private boolean german = false;

	public Car() {

	}

	public Car(String make, String model, int cruisingSpeed, String color) {
		super(make, model, cruisingSpeed, color);

	}

	public Car(String make, String model, int cruisingSpeed, String color, String engine, boolean german) {
		super(make, model, cruisingSpeed, color);
		this.engine = engine;
		this.german = german;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public boolean isGerman() {
		return german;
	}

	public void setGerman(boolean german) {
		this.german = german;
	}

}
