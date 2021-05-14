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
		
		
		for (int i = 0; i>10; i++) {
			for (int j = 0; j>10; j++) {
				
			}
		}
	}

}
