package com.qa.garage;

public class Runner {

	private static Boolean True;

	public static void main(String[] args) {
		
		Car car = new Car(True, 1500, "Blue", 1000, 500, 200, 2000, 10000);
		Car car2 = new Car(True, 1500, "Red", 1000, 500, 200, 2000, 8000);
		Garage garage = new Garage(10000,  10000,  10000);
		garage.addVehicle(car);
		garage.addVehicle(car2);
		System.out.println(garage);
		System.out.println(garage.calculateBill());
	}
	
}
