package com.qa.garage;

public class Bicycle extends Vehicle {

	private boolean electric = false;
	private String frameMaterial = "";

	public Bicycle() {

	}

	public Bicycle(String make, String model, int cruisingSpeed, String color) {
		super(make, model, cruisingSpeed, color);
	}

	public Bicycle(String make, String model, int cruisingSpeed, String color, boolean electric, String frameMaterial) {
		super(make, model, cruisingSpeed, color);
		this.electric = electric;
		this.frameMaterial = frameMaterial;
	}

	public boolean isElectric() {
		return electric;
	}

	public void setElectric(boolean electric) {
		this.electric = electric;
	}

	public String getFrameMaterial() {
		return frameMaterial;
	}

	public void setFrameMaterial(String frameMaterial) {
		this.frameMaterial = frameMaterial;
	}

}
