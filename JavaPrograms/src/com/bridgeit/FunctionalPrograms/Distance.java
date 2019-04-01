package com.bridgeit.FunctionalPrograms;

/******************************************************************************
 * Compilation: javac -Distance.java Execution: java -
 * com.bridgeit.AlgorithmPrograms.Distance
 * 
 * Purpose: Print the output Coupon numbers
 *
 * @author Srujan Madipeddi
 * @version 1.0
 * @Date 11-03-2019
 *
 ******************************************************************************/
public class Distance {
	public static void main(String[] args) {
		try {

			// Converting string to integer
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			// Applying math.pow method
			double distance1 = Math.pow(x, 2);
			double distance2 = Math.pow(y, 2);
			double distance = Math.sqrt(distance1 + distance2);
			// Printing output on console
			System.out.println("distance is " + distance);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Please pass the values though the command line argument ");
		}
	}
}
