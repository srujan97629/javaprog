package com.bridgeit.AlgorithmPrograms;

/******************************************************************************
 *  Compilation:  javac -DayOfWeek.java
 *  Execution:    java - com.bridgeit.AlgorithmPrograms.DayOfWeek
 *  
 *  Purpose: Print the output as week  by taking input as date 
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   12-03-2019
 *
 ******************************************************************************/
import com.bridgeit.utilitypack.Utility;

public class DayOfWeek {
	public static void main(String[] args) {
		// Passing values through Command line argument
		try {
			int month = Integer.parseInt(args[0]);
			int day = Integer.parseInt(args[1]);
			int year = Integer.parseInt(args[2]);
			int week = Utility.day(month, day, year);

			switch (week) {
			case 0:
				System.out.println("Monday");
				break;
			case 1:
				System.out.println("Tuesday");
				break;
			case 2:
				System.out.println("wednesday");
				break;
			case 3:
				System.out.println("Thursday");
				break;
			case 4:
				System.out.println("Friday");
				break;
			case 5:
				System.out.println("Saturday");
				break;
			case 6:
				System.out.println("Sunday");
				break;
			default:
				System.err.println("Enter correct details");
				break;
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Please Enter correct values through command line argument ");
		}
	}
}
