package com.bridgeit.DataStructures;

/******************************************************************************
 *  Compilation:  javac -FlipCoin.java
 *  Execution:    java - com.bridgeit.DataStructures.PolindromeCheck
 *  
 *  Purpose: Checks given String is palindrome or not 
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   20-03-2019
 *
 ******************************************************************************/
import java.util.Scanner;

import com.bridgeit.DataStructures.utility.Dequeue;

public class PalindromeCheck {

	public static Dequeue<String> queue = new Dequeue<String>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to check palindrome are not");
		// Taking user input
		String input = scan.nextLine();
		// Converting string to char
		char[] charA = input.toCharArray();
		// String characters into dequeue object
		for (int i = 0; i < charA.length; i++) {
			queue.addRear(Character.toString(charA[i]));
		}
		String reverse = "";

		int length = queue.size();
		for (int i = 0; i < length; i++) {
			// reversing the given String
			reverse = reverse + queue.removeRear();
		}
		// Comparing the Strings
		if (input.compareTo(reverse) == 0) {
			System.out.println("the string is palindrome");
		} else {
			System.out.println("the string is not a palindrome");
		}
	}

}
