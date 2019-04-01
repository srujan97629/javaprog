package com.bridgeit.AlgorithmPrograms;

import java.util.InputMismatchException;

/******************************************************************************
 *  Compilation:  javac -  MergeSort.java
 *  Execution:    java - com.bridgeit.AlgorithmPrograms.MergeSort
 *  
 *  Purpose: To Sort the Elements
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   15-03-2019
 *
 ******************************************************************************/

import com.bridgeit.utilitypack.Utility;

public class MergeSort {
	public static void main(String[] args) {
		System.out.println("Enter size of array ");
		try {
			// Taking size of an array
			int number = Utility.getInteger();
			// Passing size to array
			int[] arr = new int[number];
			System.out.println("Enter " + number + " numbers");

			for (int i = 0; i < number; i++) {
				// Adding values to array
				arr[i] = Utility.getInteger();
			}

			Utility.sort(arr, 0, arr.length - 1);
			System.out.println("Sorted elements are ");
			// Printing array elements on console
			Utility.printArray(arr);
		} catch (InputMismatchException e) {
			System.err.println("Please enter number only");
		}
	}
}
