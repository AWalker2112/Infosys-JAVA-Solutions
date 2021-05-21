package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	private static Boolean True;

	public static void main(String[] args) {
		
		Car car = new Car(True, 1500, "Blue", 1000, 500, 200, 2000);
		List<Vehicle> contents = new ArrayList<>();
		Garage garage = new Garage(contents,  10000,  10000,  10000);
		garage.addVehicle(car);
		System.out.println(garage);
	}
	
}
