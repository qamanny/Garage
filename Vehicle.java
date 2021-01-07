package com.qa.garage;

public class Vehicle {

	private String make;
	private String model;
	private int cruisingSpeed;
	private String color;

	public Vehicle(String make, String model, int cruisingSpeed, String color) {
		super();
		this.make = make;
		this.model = model;
		this.cruisingSpeed = cruisingSpeed;
		this.color = color;
	}

	public Vehicle() {

	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCruisingSpeed() {
		return cruisingSpeed;
	}

	public void setCruisingSpeed(int cruisingSpeed) {
		this.cruisingSpeed = cruisingSpeed;
	}

	public void add(Vehicle vehiclelist) {
		
	}

}
