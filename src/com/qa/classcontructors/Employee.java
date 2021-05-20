package com.qa.classcontructors;

public class Employee extends Person {

	private double annualSalary;
	private double weeklySalary;

	public Employee(String name, String gender, int age, double annualSalary) {
		super(name, gender, age);
		this.annualSalary = annualSalary;
		calculateWeeklySalary(annualSalary);
	}

	private double calculateWeeklySalary(double annualSalary) {
		weeklySalary = annualSalary / 52;
		return weeklySalary;

	}

	// GETSET

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public String toString() {
		return "Employee [annualSalary=" + annualSalary + ", weeklySalary=" + weeklySalary + "]";
	}
	
	

}