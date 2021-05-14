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

		String wordNumber = "";
		int numOne = num1 % 10;
		int numTen = (num1 - (num1 % 10)) / 10;

		if (num1 < 20) {
			for (int i = 0; i < 19; i++) {
				if (num1 == i) {

					wordNumber = numNames[i];
					System.out.println(wordNumber);
				}

			}
		} else {
			for (int i = 0; i < 10; i++) {

				if (numTen == i) {

					wordNumber = tensNames[i];

				}
			}
			for (int i = 0; i < 10; i++) {

				if (numOne == i) {

					wordNumber = wordNumber + numNames[i];

				}
			}

		}
		System.out.println(wordNumber);
	}

	public static void iterationNumbersMethod3(int num1) {

		String wordNumber = "";
		int numOne = num1 % 10;
		int numTen = ((num1 % 100) - ((num1 % 100) % 10)) / 10;
		int numHun = (num1 - (num1 % 100)) / 100;
		System.out.println(numOne);
		System.out.println(numTen);
		System.out.println(numHun);
		if (num1 < 20) {
			for (int i = 0; i < 19; i++) {
				if (num1 == i) {

					wordNumber = numNames[i];
					System.out.println(wordNumber);
				}

			}
		} else {
			for (int i = 0; i < 10; i++) {

				if (numHun == i && numHun != 0) {

					wordNumber = numNames[i] + " hundred and";

				}
			}

			for (int i = 0; i < 10; i++) {

				if (numTen == i) {

					wordNumber = wordNumber + tensNames[i];

				}
			}
			for (int i = 0; i < 10; i++) {

				if (numOne == i) {

					wordNumber = wordNumber + numNames[i];

				}
			}

		}
		System.out.println(wordNumber);
	}

	public static void iterationNumbersMethod4(int num1) {

		String wordNumber = "";
		int numOne = num1 % 10;
		int numTen = ((num1 % 100) - ((num1 % 100) % 10)) / 10;
		int numHun = ((num1 % 1000) - ((num1 % 1000) % 100)) / 100;
		int numTho = (num1 - (num1 % 1000)) / 1000;

		System.out.println(numOne);
		System.out.println(numTen);
		System.out.println(numHun);
		System.out.println(numTho);
		if (num1 < 20) {
			for (int i = 0; i < 19; i++) {
				if (num1 == i) {

					wordNumber = numNames[i];
					System.out.println(wordNumber);
				}

			}
		} else {
			for (int i = 0; i < 10; i++) {

				if (numTho == i && numTho != 0) {

					wordNumber = numNames[i] + " Thousand,";

				}
			}
			for (int i = 0; i < 10; i++) {

				if (numHun == i && numHun != 0) {

					if (numTen == 0 && numOne == 0) {
						wordNumber = wordNumber + numNames[i] + " hundred";
					} else {
						wordNumber = wordNumber + numNames[i] + " hundred and";
					}

				}
			}

			for (int i = 0; i < 10; i++) {

				if (numTen == i) {

					wordNumber = wordNumber + tensNames[i];

				}
			}
			for (int i = 0; i < 10; i++) {

				if (numOne == i) {

					wordNumber = wordNumber + numNames[i];

				}
			}

		}
		System.out.println(wordNumber);
	}

}