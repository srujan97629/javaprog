package com.bridgeit.AlgorithmPrograms;

/******************************************************************************
 *  Compilation:  javac - GuessNumber.java
 *  Execution:    java -com.bridgeit.AlgorithmPrograms.GuessNumber
 *  
 *  Purpose: Guess the number you assumed  by computer in between given numbers 
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   13-03-2019
 *
 ******************************************************************************/
import com.bridgeit.utilitypack.Utility;

public class GuessNumber {
	public static void main(String[] args) {
		int number;
		try { // Taking the input from command line
				// Converting String to Integer
			number = Integer.parseInt(args[0]);
			int[] arr = new int[number];
			// for loop for add the numbers
			for (int i = 0; i < arr.length; i++) {
				arr[i] = i;
			}
			System.out.println("select the value range from0 to " + (number - 1));
			char choice;
			do {
				System.out.println("have you assumed a number");
				System.out.println(" please enter y/n");
				choice = Utility.getString().toLowerCase().charAt(0);
			} while (choice != 'y');
			guessMethod(arr, number - 1, 0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(" Please Enter correct values through command line argument ");
		}

	}

	public static void guessMethod(int[] arr, int rare, int last) {
		int mid;
		char answer;
		if (rare == last) {
			System.out.println("Your number is " + arr[last]);

		} else {
			mid = ((rare + last) / 2);
			System.out.println("Your assumed number equal or smaller compared to " + arr[mid]);
			System.out.println("Enter y/n ");
			answer = Utility.getString().toLowerCase().charAt(0);
			if (answer == 'y') {
				guessMethod(arr, mid - 1, last);

			} else if (answer == 'n') {
				guessMethod(arr, rare, mid + 1);

			} else {
				System.err.println("Not in Range");
			}

		}
	}

}
