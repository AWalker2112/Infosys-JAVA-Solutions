package com.qa.conditions;

public class FizzBuzz {
	
	
	public static String fizzBuzz(int input) {
		
		
		String fizzBuzz = Integer.toString(input);
		
		if (input % 3 == 0 ) {
			
			fizzBuzz = "Fizz";
			if (input % 5 == 0 ) {
				
				fizzBuzz = "FizzBuzz";
				return fizzBuzz;
			}
			
		}
		
		if (input % 5 == 0 ) {
			
			fizzBuzz = "Buzz";
			
		}
		
		
		return fizzBuzz;
	}

}
