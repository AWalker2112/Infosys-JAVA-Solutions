package com.qa.conditions;

public class Results {
	public static int physics;
	public static int chemistry;
	public static int biology;
	public static int total;
	public static double percentage;
	
	
	public static void method1(int phygrade, int chemgrade, int biograde) {
		
		physics = phygrade;
		chemistry = chemgrade;
		biology = biograde;
		method2();
		
		System.out.println("You're Physics Grade is: " + physics + ". You're Physics Percentage is: "
				+ ((physics * 100) / 150) + "%");
		
		System.out.println("You're Chemistry Grade is: " + chemistry + ". You're Chemisty Percentage is: "
				+ ((chemistry * 100) / 150) + "%");
		
		System.out.println("You're Biology Grade is: " + biology + ". You're Biology Percentage is: "
				+ ((biology * 100) / 150) + "%");
		
		System.out.println("You're Total Grade is: " + total + ". You're Total Percentage is: "
				+ percentage + "%");
		
	}
	
	public static void method2() {
		
		total = physics + chemistry + biology;
		percentage = (total * 100) / 450;

		
	}

}
