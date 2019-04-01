package com.bridgeit.AlgorithmPrograms;

/******************************************************************************
 *  Compilation:  javac -d bin ToBinary.java
 *  Execution:    java -cp bin com.bridgeit.AlgorithmPrograms.ToBinary0
 *  
 *  Purpose: To Converting decimal to binary  
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   14-03-2019
 *
 ******************************************************************************/
import java.util.InputMismatchException;

import com.bridgeit.utilitypack.Utility;

public class ToBinary {
	public static void main(String[] args) {

		try {
			System.out.println("Enter a number");
			// Taking input from user
			int number = Utility.getInteger();
			// Converting to binary by using toBinary method present in utility package
			toBinary(number);
		}
		// Catching the exception
		catch (InputMismatchException e) {
			System.err.println("Please enter number only");
		}
	}
	public static int[] toBinary(int number) {
		int[] binary = new int[1000];
		System.out.println("Binary degit of " + number + " is ");
		int i = 0;
		while (number > 0) {
			binary[i] = number % 2;
			number = number / 2;
			i++;
		}

		for (int j = i - 1; j > 0; j--) {
			System.out.print(+binary[j]);
		}
		return binary;
	}
}
