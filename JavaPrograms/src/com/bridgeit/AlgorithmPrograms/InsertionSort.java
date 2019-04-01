package com.bridgeit.AlgorithmPrograms;

/******************************************************************************
 *  Compilation:  javac -d bin InsertionSort.java
 *  Execution:    java -cp bin com.bridgeit.AlgorithmPrograms.insertionSort
 *  
 *  Purpose: To Sort the Elements
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   15-03-2019
 *
 ******************************************************************************/

import com.bridgeit.utilitypack.Utility;

public class InsertionSort {
	public static void main(String[] args) {
		// Taking input from user
		System.out.println("Enter your String line ");
		String st = new String(Utility.sc.nextLine());
		// splitting line into words
		String[] arr = st.split(" ");
		// Using insertionString method present in utility package
		String[] arr2 = Utility.insertionString(arr);
		// Printing the sorted elements
		Utility.printStringArray(arr2);
	}
}
