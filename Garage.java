package com.qa.garage;

import java.util.ArrayList;

public class Garage {
	int bicyclePrice = 100;
	int carPrice = 1000;
	int planePrice = 10000;

	private ArrayList<Vehicle> vehiclelist = new ArrayList<>();

	public Garage() {

	}

	public void addVehicles(Vehicle vehiclelist) {
		vehiclelist.add(vehiclelist);
	}

	public void deleteVehicles(String type) {

		if (type.equals("Car")) {
			for (Vehicle cars : vehiclelist) {
				vehiclelist.remove(cars);
			}

		}

		if (type.equals("Bicycle")) {
			for (Vehicle bicycle : vehiclelist) {
				vehiclelist.remove(bicycle);
			}

		}

		if (type.equals("Plane")) {
			for (Vehicle plane : vehiclelist) {
				vehiclelist.remove(plane);
			}
		}

	}

	public void empty() {
		vehiclelist = new ArrayList<>();
	}

	public void bill() {

		for (Vehicle vehiclelist : vehiclelist) {
			if (vehiclelist instanceof Car) {
				System.out.println("Hello there lad, your carraige fee is hence £ " + carPrice);
			}
			if (vehiclelist instanceof Bicycle) {
				System.out.println("Hello there lad, your carraige fee is hence £ " + bicyclePrice);
			}
			if (vehiclelist instanceof Plane) {
				System.out.println("Hello there lad, your carraige fee is hence £" + planePrice);
			}
		}
	}

	@Override
	public String toString() {
		return "Garage [bicyclePrice=" + bicyclePrice + ", carPrice=" + carPrice + ", planePrice=" + planePrice
				+ ", vehiclelist=" + vehiclelist + "]";
	}

}
