package com.bridgeit.FunctionalPrograms;

/******************************************************************************
 *  Compilation:  javac -QuadraticExpression.java
 *  Execution:    java - com.bridgeit.AlgorithmPrograms.QuadraticExpression
 *  
 *  Purpose: Print value of x in quadratic Expression by giving a,b,c values    
 *           
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   11-03-2019
 *
 ******************************************************************************/
import java.util.InputMismatchException;

import com.bridgeit.utilitypack.Utility;

public class QuadraticExpression {
	public static void main(String[] args) {
		try {
			// Taking inputs from user
			System.out.println("Enter value of A  ");
			int a = Utility.getInteger();
			System.out.println("Enter value of B  ");
			int b = Utility.getInteger();
			System.out.println("Enter value of C  ");
			int c = Utility.getInteger();
			// using inbuilt method
			quadratic(a, b, c);
		} catch (InputMismatchException e) {
			System.out.println("Enter number only ");
			System.err.println("Try again");
		}
	}

	public static void quadratic(int a, int b, int c) {
		// delta formula
		double delta = b * b - 4 * a * c;
		double root1 = (-b + Math.sqrt(delta)) / (2 * a);
		double root2 = (-b - Math.sqrt(delta)) / (2 * a);
		// Printing roots of x values
		System.out.println("Roots of X =(" + root1 + "," + root2 + ")");
	}

}
