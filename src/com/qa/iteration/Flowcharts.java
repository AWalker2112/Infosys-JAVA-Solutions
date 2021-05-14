package com.qa.iteration;

public class Flowcharts {

	public static void flowCharts1() {

		Integer A = 100;
		boolean ACount = true;

		while (ACount) {

			A++;
			System.out.println("A");

			if (A > 200) {

				ACount = false;

			}

		}

	}

	public static void flowCharts2() {

		Integer A = 100;
		boolean ACount = true;

		while (ACount) {

			if (A % 2 == 0) {
				System.out.println("-");

			} else {
				System.out.println("*");
			}

			A++;
			if (A > 200) {

				ACount = false;

			}

		}

	}

	public static void flowCharts3() {

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				System.out.println(j);
			}
		}
	}

	public static void flowCharts4() {

		Integer A = 100;

		for (int i = A; i < 200; i++) {

			A++;

		}
		
		A = 100; //This is to reset A

		for (int i = A; i < 200; i++) {

			if (A % 2 == 0) {
				System.out.println("-");

			} else {
				System.out.println("*");
			}

			A++;


		}

	}
	
	public static void flowCharts5(Integer input) {
		
		for(int i = 0; i < input;i++) {
			
			System.out.println(input);
		}
		
	}

}
