package com.qa.garage;

public class Van extends Vehicle{

	public Van(Boolean hasWheels, double engineSize, String colour, int length, int width, int height, int mass) {
		super(hasWheels, engineSize, colour, length, width, height, mass);
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
		return "Van [hasWheels=" + hasWheels + ", engineSize=" + engineSize + ", colour=" + colour + ", length="
				+ length + ", width=" + width + ", height=" + height + ", mass=" + mass + "]";
	}
	
	

}
