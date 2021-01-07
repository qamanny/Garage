package com.qa.garage;

public class Plane extends Vehicle {

	private int wingSpan = 40;
	private int numberBuilt = 1;

	public Plane() {

	}

	public Plane(String make, String model, int cruisingSpeed, String color) {
		super(make, model, cruisingSpeed, color);
	}

	public Plane(String make, String model, int cruisingSpeed, String color, int wingSpan, int numberBuilt) {
		super(make, model, cruisingSpeed, color);
		this.wingSpan = wingSpan;
		this.numberBuilt = numberBuilt;
	}

	public int getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}

	public int getNumberBuilt() {
		return numberBuilt;
	}

	public void setNumberBuilt(int numberBuilt) {
		this.numberBuilt = numberBuilt;
	}

}
