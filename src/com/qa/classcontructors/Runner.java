package com.qa.classcontructors;

import java.util.ArrayList;

public class Runner {
	
	public static void main(String[] args) {
	
		Person alex = new Person("Alex", "male", 25);
		Book lotr = new Book("Lord of the Rings", 5000, "Tolkin");
		Employee bob = new Employee("Alex", "male", 25, 3000);
		
		ArrayList<String> array = new ArrayList<>();
		array.add("English");
		array.add("Maths");
		
		Trainee james = new Trainee("James", "male", 25, 30000, array);
		System.out.println(james.getSubjectLearned());
		james.addSubject("History");
		System.out.println(james.getSubjectLearned());
		
		alex.read(lotr);
		System.out.println(bob.getWeeklySalary());
		
		System.out.println(bob);
		
	}

}
