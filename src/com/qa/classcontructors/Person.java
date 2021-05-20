package com.qa.classcontructors;

public class Person {

	public String name;
	public String gender;
	public int age;
	public boolean isBreathing;
	public int walkSpeed = 30; // in feet

	public Person(String name, String gender, int age) {
		
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public Person(String name, String gender, int age, boolean isBreathing, int walkSpeed) {
		
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.isBreathing = isBreathing;
		this.walkSpeed = walkSpeed;
	}

	public void read(Book input) {
		System.out.println(this.name + " is reading the book titled: " + input.title);
	}

	public boolean isStillBreathing() {
		return isBreathing;
	}

	public String speak(String msg) {
		return this.name + " says: " + msg;
	}

	public int walk() {
		return walkSpeed;
	}
	
	//GET/SET

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBreathing() {
		return isBreathing;
	}

	public void setBreathing(boolean isBreathing) {
		this.isBreathing = isBreathing;
	}

	public int getWalkSpeed() {
		return walkSpeed;
	}

	public void setWalkSpeed(int walkSpeed) {
		this.walkSpeed = walkSpeed;
	}
	
	

}
