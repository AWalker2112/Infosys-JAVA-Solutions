package com.qa.classcontructors;

public class Runner {
	
	public static void main(String[] args) {
	
		Person alex = new Person("Alex", "male", 25);
		Book lotr = new Book("Lord of the Rings", 5000, "Tolkin");
		
		alex.read(lotr);
		
	}

}
