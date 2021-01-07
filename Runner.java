package com.qa.garage;


public class Runner {

	public static void main(String[] args) {
		
		Car car1 = new Car("Land Rover", "Vogue", 35, "Grey", "P400e", false);
		Car car2 = new Car("Ferrari", "488 GTB", 40, "Red", "3.9 L V8", false);
		Bicycle bike1 = new Bicycle("Cyrusher", "XF800", 12, "blue", false, "Aluminium");
		Bicycle bike2 = new Bicycle("GUNAI", "JX200", 12, "green", true, "Steel");
		Plane plane1 = new Plane("Boeing", "747", 570, "white", 30, 1558);
		Plane plane2 = new Plane("Airbus", "A380", 570, "white", 30, 1000);
		
		Garage garage = new Garage();
		
		garage.addVehicles(car1);
		garage.addVehicles(car2);
		garage.addVehicles(bike1);
		garage.addVehicles(bike2);
		garage.addVehicles(plane1);
		garage.addVehicles(plane2);
		
		garage.bill();
		System.out.println(garage);
		garage.empty();
		

	}

}
