package com.bridgeit.FunctionalPrograms;

/******************************************************************************
 *  Compilation:  javac -HarmonicNumber.java
 *  Execution:    java - com.bridgeit.AlgorithmPrograms.HarmonicNumber
 *  
 *  Purpose: Print the Harmonic value of given number  
 *           
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   09-03-2019
 *
 ******************************************************************************/
import java.util.InputMismatchException;

import com.bridgeit.utilitypack.Utility;

public class HarmonicNumber {
	public static void main(String[] args) {
		System.out.println("Enter your number");
		try {
			// Taking input using scanner class
			int harmonic = Utility.sc.nextInt();
			float harmonicNumber = 0;
			if (harmonic > 0) {
				for (int i = 1; i <= harmonic; i++) {
					// Adding one by one to the reference
					harmonicNumber = harmonicNumber + (float) 1 / i;
					System.out.println(harmonicNumber);
				}
				// printing harmonic value
				System.out.println(harmonic + " Harmonic value is " + harmonicNumber);
			} else {
				System.err.println("Enter positive value ");
			}
		}
		// catching the exception
		catch (InputMismatchException e) {
			System.err.println("Enter number ");
		}

	}
}
