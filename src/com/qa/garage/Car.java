package com.qa.garage;

public class Car extends Vehicle{

	public Car(Boolean hasWheels, double engineSize, String colour, int length, int width, int height, int mass, int value) {
		super(hasWheels, engineSize, colour, length, width, height, mass, value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applyBreaks() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Car [hasWheels=" + hasWheels + ", engineSize=" + engineSize + ", colour=" + colour + ", length="
				+ length + ", width=" + width + ", height=" + height + ", mass=" + mass + "]";
	}


	
	
}
