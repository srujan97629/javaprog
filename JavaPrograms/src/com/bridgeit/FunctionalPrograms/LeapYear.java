package com.bridgeit.FunctionalPrograms;

/******************************************************************************
 *  Compilation:  javac -LeapYear.java
 *  Execution:    java - com.bridgeit.AlgorithmPrograms.LeapYear
 *  
 *  Purpose: Print the output as given year is leap year or not   
 *           
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   09-03-2019
 *
 ******************************************************************************/
import com.bridgeit.utilitypack.Utility;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter 4 digit number");
		// Taking input by using getString method present in utility package
		String syear = Utility.getString();
		// Calling year method present in utility package
		Utility.year(syear);
	}

}
