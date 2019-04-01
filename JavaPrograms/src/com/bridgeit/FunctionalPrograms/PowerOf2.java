package com.bridgeit.FunctionalPrograms;

/******************************************************************************
 * Compilation: javac -PowerOf2.java Execution: java -
 * com.bridgeit.AlgorithmPrograms.PowerOf2
 * 
 * Purpose: Print the power of 2 values based on command line argument
 * 
 * @author Srujan Madipeddi
 * @version 1.0
 * @Date 09-03-2019
 *
 ******************************************************************************/
public class PowerOf2 {
	public static void main(String[] args) {
		try {
			// converting string type to integer type
			int n = Integer.parseInt(args[0]);
			System.out.println("Given number is " + n);
			int power = 1;
			// user number should be in between 0-31
			if ((n > 0) && (n < 31)) {
				for (int i = 1; i <= n; i++) {
					power = power * 2;
					System.out.println("" + power);
				}
			} else {
				System.err.println("Out of boundary,enter value in between 1 to 31 only  ");
			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println(" Please pass value through command line ");
		}
	}
}
