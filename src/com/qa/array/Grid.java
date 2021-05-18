package com.qa.array;

public class Grid {

	public static void main(String[] args) {
		String[][] gameGrid = grid(5, 5);

		for (int row = 0; row < gameGrid.length; row++) {
			for (int col = 0; col < gameGrid[row].length; col++) {
				System.out.print(gameGrid[row][col]);
			}
			System.out.println();
		}
	}

	public static String[][] grid(int rows, int columns) {
		String[][] grid = new String[rows][columns];
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				if (row == 0 || row == rows - 1 || col == 0 || col == columns - 1) {
					grid[row][col] = "[=]";
				} else if (row == (rows / 2) && col == (columns / 2)) {
					grid[row][col] = "[X]";
				} else {
					grid[row][col] = "[-]";
				}
			}
		}
		return grid;
	}

}

//Create a method that produces a 5 x 5 grid by printing out grid spaces of the following symbol combination: [-]
//		 	
//Try to add an x in the centre of the grid
//	Using a multi-dimensional array, store characters inside this array, the borders should contain = to provide a border. 
//
//By the end of the task you should have something that looks like this:
