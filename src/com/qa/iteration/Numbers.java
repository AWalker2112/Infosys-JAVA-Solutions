package com.qa.iteration;

public class Numbers {


	private static final String[] tensNames = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
			" seventy", " eighty", " ninety" };

	private static final String[] numNames = { "", " one", " two", " three", " four", " five", " six", " seven",
			" eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
			" seventeen", " eighteen", " nineteen" };

	public static void iterationNumbersMethod1(int num1) {

		int numOne = num1 % 10;
		int numTen = (num1 - (num1 % 10)) / 10;

		System.out.println(numOne + numTen);

	}

	public static void iterationNumbersMethod2(int num1) {
		
		String wordNumber;
		int numOne = num1 % 10;
		int numTen = (num1 - (num1 % 10)) / 10;
		
		if (num1<20) {
			for (int i=0; i<19;i++) {
			if(num1 == i) {
				
				wordNumber = numNames[i];
				System.out.println(wordNumber);
			}
			
		}
		}else {
			
			for (int i=0; i<10;i++) {
			System.out.println(i);
			if(numOne == i) {
				
				wordNumber = numNames[i];
				System.out.println(wordNumber);
			}
		}
		}
		
		
		
		
		
		
	}

}