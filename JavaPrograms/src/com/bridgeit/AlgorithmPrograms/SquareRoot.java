package com.bridgeit.AlgorithmPrograms;

/******************************************************************************
 *  Compilation:  javac -d bin SquareRoot.java
 *  Execution:    java -cp bin com.bridgeit.AlgorithmPrograms.SquareRoot
 *  
 *  Purpose: SquareRoot of given number
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   13-03-2019
 *
 ******************************************************************************/
import java.util.InputMismatchException;

import com.bridgeit.utilitypack.Utility;

public class SquareRoot {
	public static void main(String[] args) {
		System.out.println("Enter value you need");
		try {
			// User input
			double c = Utility.getDouble();
			System.out.println("squaroot of " + c + "  is  " + squaroot(c));
		}
		// Catch block for catch the exception
		catch (InputMismatchException e) {
			System.err.println(" Enter valid details ");
		}
	}

	public static double squaroot(double c) {
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = ((c / t + t) / 2);
		}
		return t;
	}

}
