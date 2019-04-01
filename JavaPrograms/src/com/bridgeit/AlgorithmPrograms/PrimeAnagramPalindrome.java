package com.bridgeit.AlgorithmPrograms;

import java.util.InputMismatchException;

/******************************************************************************
 *  Compilation:  javac -d bin PrimeAnagramPalindrome.java
 *  Execution:    java -cp bin com.bridgeit.AlgorithmPrograms.PrimeAnagramPalindrome
 *  
 *  Purpose: Checking prime and palindrome and anagram and printing on console
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   13-03-2019
 *
 ******************************************************************************/
import com.bridgeit.utilitypack.Utility;

public class PrimeAnagramPalindrome {
	public static void main(String[] args) {
		try {
			System.out.println("Enter start number to print prime number");
			int start = Utility.getInteger();
			if (start != 0) {
				System.out.println("Enter end number to print prime number");
				int end = Utility.getInteger();
				for (int i = start; i <= end; i++) {
					int var = Utility.printPrime(i);
					if (var != 0)
						if (Utility.isPalindrome(var)) {
							System.out.println(var + "is Prime and palindrome");
						}
				}
			} else {
				System.err.println("please enter start number from 1 ");
				main(args);
			}
		} catch (InputMismatchException e) {
			System.out.println("Enter number only");
		}
	}
}
