package com.bridgeit.AlgorithmPrograms;
/******************************************************************************
 *  Compilation:  javac -d bin BinaryToDecimal.java
 *  Execution:    java -cp bin com.bridgeit.AlgorithmPrograms.BinaryToDecimal
 *  
 *  Purpose: To Converting binary to decimal and nibble binary equivalent finding that number is power of 2 or not 
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   15-03-2019
 *
 ******************************************************************************/

import java.util.InputMismatchException;

import com.bridgeit.utilitypack.Utility;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int decimal;
		// Using try catch blocks for input mismatch Exception
		try {
			System.out.println("Enter the positive number");
			decimal = Utility.getInteger();
			System.out.println("Decimal Number  : " + decimal);
			// converting to binary
			char[] temp = Utility.toBinaryChar(decimal);
			String binary = new String(temp);
			StringBuffer sb = new StringBuffer(binary);
			// Reversing the elements
			sb.reverse();
			binary = sb.toString();
			System.out.println("Binary equivalent of " + decimal + " : " + binary);
			// swap the 0's and 1's
			int swapped = Utility.swapNibbles(decimal);
			temp = Utility.toBinaryChar(swapped);
			// Character to String
			binary = new String(temp);
			sb = new StringBuffer(binary);
			// Reversing the elements
			sb.reverse();
			// a string representation of this sequence of characters
			binary = sb.toString();

			int toInt = Integer.parseInt(binary, 2);
			System.out.println("After swapping nibble binary equivalent :" + binary);
			System.out.println("After swapping nibble decimal equivalent :" + toInt);
			// checking that is power of two or not by passing integer
			boolean isPowerOf2 = Utility.isPowerTwo(toInt);
			if (isPowerOf2)
				System.out.println(toInt + " is  power of 2");
			else
				System.out.println(toInt + " is  not a power of 2");
		}
		// Catching the exception by using catch block
		catch (InputMismatchException e) {
			System.err.println(" Please enter number only ");
		}
	}

}
