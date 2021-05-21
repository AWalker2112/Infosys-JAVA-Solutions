package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	public List<Vehicle> contents = new ArrayList<>();
	public int length;
	public int width;
	public int height;
	
	
	
	public Garage( int length, int width, int height) {
		super();
		
		this.length = length;
		this.width = width;
		this.height = height;
	}



	public void addVehicle(Vehicle input) {
		contents.add(input);
	}
	
	public int calculateBill() {
		int totalBill = 0;
		for(Vehicle i: contents) {
			totalBill = totalBill + i.getValue();
		}
		return totalBill;
	}
	
	
	
	public List<Vehicle> getContents() {
		return contents;
	}
	public void setContents(List<Vehicle> contents) {
		this.contents = contents;
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



	@Override
	public String toString() {
		return "Garage [contents=" + contents + ", length=" + length + ", width=" + width + ", height=" + height + "]";
	}
	
	

}
