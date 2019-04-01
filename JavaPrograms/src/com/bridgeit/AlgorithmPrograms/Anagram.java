package com.bridgeit.AlgorithmPrograms;

/******************************************************************************
 *  Compilation:  javac -Anagram.java
 *  Execution:    java - com.bridgeit.AlgorithmPrograms.Anagram
 *  
 *  Purpose: Prints given number is anagram or not  
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   12-03-2019
 *
 ******************************************************************************/
import com.bridgeit.utilitypack.Utility;

public class Anagram {
	public static void main(String[] args) {
		System.out.println("Enter frist String ");
		//Taking first input from user 
		String frist = Utility.getString();
		System.out.println("Enter secound String ");
		//Taking second input from user
		String second = Utility.getString();
		if (frist.length() == second.length()) {
			//Using isAnagram method for checking whether it is anagram or not  
			if (Utility.isAnagram(frist, second)) {
				System.out.println("Given Strings are anagram");
			} else {
				System.out.println("Given Strings are not anagram");
			}
		} else {
			System.out.println("Given Strings are not Anagram");
		}
	}

}
