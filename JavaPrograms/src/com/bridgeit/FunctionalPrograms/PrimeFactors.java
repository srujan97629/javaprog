package com.bridgeit.FunctionalPrograms;

/******************************************************************************
 *  Compilation:  javac -PrimeFactors.java
 *  Execution:    java - com.bridgeit.AlgorithmPrograms.PrimeFactors
 *  
 *  Purpose: Print the prime factors for the given number  
 *           
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   11-03-2019
 *
 ******************************************************************************/
import java.util.InputMismatchException;

import com.bridgeit.utilitypack.Utility;

public class PrimeFactors {
	public static void main(String[] args) {
		// taking user input
		System.out.println(" Enter number ");
		try {
			int number = Utility.sc.nextInt();
			for (int i = 2; i <= number; i++) {
				while (number % i == 0) {
					// printing i values as prime factors
					System.out.println(i + "   ");
					number = number / i;
				}
			}
			if (number > 2) {
				System.out.println(number);
			}
		} catch (InputMismatchException e) {
			System.err.println("Please enter number");
		}
	}
}
