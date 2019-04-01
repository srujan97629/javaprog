package com.bridgeit.AlgorithmPrograms;

import java.util.InputMismatchException;

/******************************************************************************
 *  Compilation:  javac -BubbleSort.java
 *  Execution:    java - com.bridgeit.AlgorithmPrograms.BubbleSort
 *  
 *  Purpose: Print the output sorted elements 
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   12-03-2019
 *
 ******************************************************************************/
import com.bridgeit.utilitypack.Utility;

public class BubbleSort {
	public static void main(String[] args) {
		System.out.println("Enter size of an array ");
		try {
			// Taking input from user
			int size = Utility.getInteger();

			// Giving size to an array
			int[] arr = new int[size];
			System.out.println("Enter " + size + " values only");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Utility.getInteger();
			}
			int[] fvalue = Utility.bubbleInt(arr);

			// Printing sorted elements
			Utility.printArray(fvalue);
		} catch (InputMismatchException e) {
			System.err.println("Please enter number only ");
		}
	}
}
