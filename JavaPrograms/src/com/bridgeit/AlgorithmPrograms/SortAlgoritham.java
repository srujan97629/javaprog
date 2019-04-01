package com.bridgeit.AlgorithmPrograms;

/******************************************************************************
 *  Compilation:  javac -d bin SortAlgoritham.java
 *  Execution:    java -cp bin com.bridgeit.AlgorithmPrograms.SortAlgoritham
 *  
 *  Purpose: To Sort the Elements
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   15-03-2019
 *
 ******************************************************************************/

import java.util.InputMismatchException;

import com.bridgeit.utilitypack.Utility;

public class SortAlgoritham {
	public static void main(String[] args) {
		System.out.println("Enter 1 for Binary Search Method for String ");

		System.out.println("Enter 2 for Binary Search Method for Integer ");

		System.out.println("Enter 3 for Insertion Sort Method for String ");

		System.out.println("Enter 4 for Insertion Sort Method for Integer ");

		System.out.println("Enter 5 for Bubble  Sort Method for String ");

		System.out.println("Enter 6 for Bubble  Sort Method for Integer ");

		try {
			// User input
			int input = Utility.getInteger();

			switch (input) {
			case 1:
				Utility.binarySearchString();
				break;
			case 2:
				Utility.binarySearchInt();
				break;
			case 3:
				Utility.insertionSortString();
				break;
			case 4:
				Utility.insertionSortInt();
				break;
			case 5:
				Utility.bubbleSortString();
				break;
			case 6:
				Utility.bubbleSortInt();
				break;
			default:
				System.err.println(" Please enter  correct numbers ");

			}
		} catch (InputMismatchException e) {
			System.err.println(" Please enter numbers only ");
		}
	}

}
