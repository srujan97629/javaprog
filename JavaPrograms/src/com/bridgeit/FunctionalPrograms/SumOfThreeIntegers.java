package com.bridgeit.FunctionalPrograms;

import java.util.InputMismatchException;

/******************************************************************************
 *  Compilation:  javac -SumOfThreeIntegers.java
 *  Execution:    java - com.bridgeit.AlgorithmPrograms.SumOfThreeIntegers
 *  
 *  Purpose: Checking that sum  given 3 numbers is equal to 0 or not  
 *           
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   11-03-2019
 *
 ******************************************************************************/
import com.bridgeit.utilitypack.Utility;

public class SumOfThreeIntegers {
	public static void main(String[] args) {
		try {
			int i, j, k, sum = 0;
			int[] arr = new int[3];

			System.out.println("Enter 3 degits only");
			// Adding values into array element
			for (i = 0; i <= arr.length - 1; i++) {
				arr[i] = Utility.getInteger();
			}
			for (i = 0; i < arr.length - 2; i++)// using first element
			{
				for (j = i + 1; j < arr.length - 1; j++)// using second element
				{
					for (k = j + 1; k < arr.length; k++)// using third element
					{
						if (arr[i] + arr[j] + arr[k] == sum)// checking 3 elements are equal or not
						{
							System.out.println("sum of the given 3 numbers are equal to 0");
						} else {
							System.err.println("sum of the given 3 numbers are not equal to 0 ");
						}
					}
				}
			}
		} catch (IndexOutOfBoundsException | InputMismatchException e) {
			System.err.println("Enter valid Details");
		}
	}
}
