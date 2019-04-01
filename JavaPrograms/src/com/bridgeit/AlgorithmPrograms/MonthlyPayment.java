package com.bridgeit.AlgorithmPrograms;

/******************************************************************************
 *  Compilation:  javac -d bin MonthlyPayment.java
 *  Execution:    java -cp bin com.bridgeit.AlgorithmPrograms.MonthlyPayment
 *  
 *  Purpose: Output  monthly payment  
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   13-03-2019
 *
 ******************************************************************************/
import java.util.InputMismatchException;

import com.bridgeit.utilitypack.Utility;

public class MonthlyPayment {
	public static void main(String[] args) {
		try {
			// Taking values from command line argument
			int payment = Integer.parseInt(args[0]);
			System.out.println("Amount is : " + payment);

			int years = Integer.parseInt(args[1]);
			System.out.println("years is : " + years);

			double rate = Double.parseDouble(args[2]);
			System.out.println("Rate of iterest : " + rate);

			int interest = Utility.payment(payment, years, rate);
			System.out.println("Rate of interest is : " + interest);
			System.out.println("Final amount is : " + (payment + interest));
		} catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
			System.err.println("Please Enter correct values through command line argument only");
		}
	}

}
