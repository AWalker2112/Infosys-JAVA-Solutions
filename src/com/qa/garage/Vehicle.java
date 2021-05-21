package com.qa.garage;

public abstract class Vehicle {

	public Boolean hasWheels;
	public double engineSize;
	public String colour;
	public int length;
	public int width;
	public int height;
	public int mass;
	public int value;

	public abstract void accelerate();

	public abstract void applyBreaks();

	public Vehicle(Boolean hasWheels, double engineSize, String colour, int length, int width, int height, int mass, int value) {
		super();
		this.hasWheels = hasWheels;
		this.engineSize = engineSize;
		this.colour = colour;
		this.length = length;
		this.width = width;
		this.height = height;
		this.mass = mass;
		this.value = value;
	}

	public Boolean getHasWheels() {
		return hasWheels;
	}

	public void setHasWheels(Boolean hasWheels) {
		this.hasWheels = hasWheels;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
