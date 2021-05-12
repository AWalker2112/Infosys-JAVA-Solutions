package com.qa.main;

public class ResultsRevisited {

	public static int physics;
	public static int chemistry;
	public static int biology;
	public static int total;
	public static double percentage;

	
	public static void method1(int phygrade, int chemgrade, int biograde) {

		physics = phygrade;
		chemistry = chemgrade;
		biology = biograde;
		
		Integer phyCount = 0;
		Integer chemCount = 0;
		Integer bioCount = 0;

		method2();

		if (((physics * 100) / 150) > 60) {
			System.out.println("You're Physics Grade is: " + physics + ". You're Physics Percentage is: "
					+ ((physics * 100) / 150) + "%");
		} else {
			System.out.println("You have failed Physics.");
			phyCount++;
		}

		if (((chemistry * 100) / 150) > 60) {
			System.out.println("You're Chemistry Grade is: " + chemistry + ". You're Chemisty Percentage is: "
					+ ((chemistry * 100) / 150) + "%");
		} else {
			System.out.println("You have failed Chemistry.");
			chemCount++;
		}

		if (((biology * 100) / 150) > 60) {
			System.out.println("You're Biology Grade is: " + biology + ". You're Biology Percentage is: "
					+ ((biology * 100) / 150) + "%");
		} else {
			System.out.println("You have failed Biology.");
			bioCount++;
		}

		
		Integer countTotal;
		countTotal = phyCount + chemCount + bioCount;
		
		
		if (percentage > 60 && ((physics * 100) / 150) > 60 && ((chemistry * 100) / 150) > 60
				&& ((biology * 100) / 150) > 60) {
			System.out.println("You're Percentage is: " + percentage + "%. Well Done!");

		} else {

			if ((((physics * 100) / 150) > 60 && ((chemistry * 100) / 150) > 60) && bioCount != 1) {
				System.out.println("You have failed Biology.");

			} else if ((((physics * 100) / 150) > 60 && ((biology * 100) / 150) > 60) && chemCount != 1) {
				System.out.println("You have failed Chemistry.");

			} else if ((((chemistry * 100) / 150) > 60 && ((biology * 100) / 150) > 60) && phyCount != 1) {
				System.out.println("You have failed Physics.");
			} else if(countTotal>1) {
				System.out.println(
						"You have failed more than one exam. " + "You're overall percentage is: " + percentage + "%");

			}

		}

	}

	public static void method2() {

		total = physics + chemistry + biology;
		percentage = (total * 100) / 450;

	}

}
