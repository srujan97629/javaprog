package com.bridgeit.AlgorithmPrograms;

import java.util.InputMismatchException;

/******************************************************************************
 *  Compilation:  javac -d bin SquareRoot.java
 *  Execution:    java -cp bin com.bridgeit.AlgorithmPrograms.PrimeNumber
 *  
 *  Purpose: Print the number which are present in between numbers
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   13-03-2019
 *
 ******************************************************************************/
import com.bridgeit.utilitypack.Utility;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter start number to print prime number");
		try {
			// Taking input
			int start = Utility.getInteger();
			if (start != 0) {
				System.out.println("Enter end number to print prime number");
				// Enter end number
				int end = Utility.getInteger();
				for (int i = start; i <= end; i++) {
					int var = Utility.printPrime(i);
					if (var != 0 && var != 1) {
						// Printing out out on console
						System.out.println("prime numbers are " + var);
					}
				}
			} else {
				System.err.println("please enter start number from ");
				// calling main function for execution
				main(args);
			}
		} catch (InputMismatchException e) {
			System.err.println("Enter valid input ");
		}

	}

}
