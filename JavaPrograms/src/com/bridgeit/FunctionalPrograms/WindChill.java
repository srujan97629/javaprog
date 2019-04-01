package com.bridgeit.FunctionalPrograms;

import java.util.InputMismatchException;

/******************************************************************************
 * Compilation: javac -WindChill.java Execution: java -
 * com.bridgeit.AlgorithmPrograms.WindChill
 * 
 * Purpose: To print defines the effective temperature
 * 
 * @author Srujan Madipeddi
 * @version 1.0
 * @Date 11-03-2019
 *
 ******************************************************************************/
public class WindChill {
	public static void main(String[] args) {
		try {
			double temp = Double.parseDouble(args[0]);
			double speed = Double.parseDouble(args[1]);
			if ((temp < 50) && (3 < speed) && (speed < 120)) {
				double wind = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(speed, 0.16);
				System.out.println(wind);
			}
		} catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
			System.out.println("Please enter values through command prompt ");
		}

	}
}
