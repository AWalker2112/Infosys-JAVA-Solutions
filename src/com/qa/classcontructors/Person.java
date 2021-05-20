package com.qa.classcontructors;

public class Person {

	public String name;
	public String gender;
	public int age;
	public boolean isBreathing;
	public int walkSpeed = 30; // in feet

	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public Person(String name, String gender, int age, boolean isBreathing, int walkSpeed) {
		super();
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

}
