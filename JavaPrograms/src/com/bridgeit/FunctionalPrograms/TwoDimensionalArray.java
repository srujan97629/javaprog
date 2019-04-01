package com.bridgeit.FunctionalPrograms;

import java.util.InputMismatchException;

/******************************************************************************
 *  Compilation:  javac -TwoDimensionalArray.java
 *  Execution:    java - com.bridgeit.AlgorithmPrograms.TwoDimensionalArray
 *  
 *  Purpose: To print two dimensional array 
 *           
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   11-03-2019
 *
 ******************************************************************************/
import com.bridgeit.utilitypack.Utility;

public class TwoDimensionalArray {
	public static void main(String args[]) {
		try {
			// initializing
			int row, column;
			// enter row and column for array.
			System.out.print("Enter row for the array :");
			row = Utility.getInteger();
			System.out.print("Enter column for the array : ");
			column = Utility.getInteger();

			// Calling Two dimensional array method
			getTwoDimensionalArray(row, column);

		} catch (InputMismatchException e) {
			System.err.println("Enter number only ");
			System.err.println("Try again");
		}
	}

	public static void getTwoDimensionalArray(int row, int column) {
		int i, j;
		String arr[][] = new String[row][column];

		// enter array elements
		System.out.println("Enter " + (row * column) + " Array Elements : ");
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				arr[i][j] = Utility.getString();
			}
		}
		System.out.println("Your Array is :");

		// Printing output on console
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
