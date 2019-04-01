package com.bridgeit.DataStructures;

/******************************************************************************
 *  Compilation:  javac -PrimeRange2D.java
 *  Execution:    java - com.bridgeit.DataStructures.PrimeRange2D
 *  
 *  Purpose: Printing primeAnagram numbers 
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   22-03-2019
 *
 ******************************************************************************/
import com.bridgeit.utilitypack.Utility;

public class PrimeRange2D {
	public static void main(String[] args) {
		int[] array = Utility.primeNumber();
		// We have to print the elements in order of
		// 0-100,100-200 like this so             
		int[][] array1 = new int[10][167];

		for (int i = 0; i < 10; i++) {
			System.out.println(" ");
			System.out.println("from " + i * 100 + " To " + (i + 1) * 100);
			// j<167 means j stands for index element in array reference
			for (int j = 0; j < 167; j++) {
				if (array[j] > ((i) * 100) && array[j] < ((i + 1) * 100)) {
					array1[i][j] = array[j];
					System.out.print(array1[i][j] + " ");
				}
			}
			System.out.println(" ");
		}

	}
}
