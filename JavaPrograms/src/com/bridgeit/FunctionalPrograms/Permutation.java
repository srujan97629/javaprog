package com.bridgeit.FunctionalPrograms;

/******************************************************************************
 *  Compilation:  javac -Permutation.java
 *  Execution:    java - com.bridgeit.AlgorithmPrograms.Permutation
 *  
 *  Purpose: Print the Permutation of an element   
 *           
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   11-03-2019
 *
 ******************************************************************************/
import com.bridgeit.utilitypack.Utility;

public class Permutation {
	public static void main(String[] args) {
		System.out.println(" Enter any string  ");
		// Taking user input
		String input = Utility.getString();
		// tocharArray method used for converting string to char array
		permutation(input.toCharArray(), 0);
	}

	public static void permutation(char[] ch, int index) {
		if (index == ch.length - 1) {
			System.out.println(String.valueOf(ch));
		}
		for (int i = index; i <= ch.length - 1; i++) {
			// Swapping the elements
			Utility.swapping(ch, index, i);
			permutation(ch, index + 1);
			Utility.swapping(ch, index, i);
		}

	}

}
