package com.bridgeit.DataStructures;

/******************************************************************************
 *  Compilation:  javac -AnagramQueue.java
 *  Execution:    java - com.bridgeit.DataStructures.AnagramQueue
 *  
 *  Purpose: Checks given String is Anagram or not and gives the output 
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   20-03-2019
 *
 ******************************************************************************/
import com.bridgeit.DataStructures.utility.Queue;
import com.bridgeit.utilitypack.Utility;

public class AnagramQueue {

	public static void main(String[] args) {

		Queue<String> refQ = new Queue<String>(160);
		int i;
		String compare1 = " ";
		String compare2 = " ";
		String adding = " ";
		// Storing prime numbers in arr array
		int array[] = Utility.primeNumber();
		// Creating String array by passing length of the (arr)
		String[] storing = new String[array.length];
		StringBuffer sb = new StringBuffer(array.length);
		for (i = 0; i < array.length; i++) {
			// We cannot convert integers toString so by using String buffer
			// class we are converting
			adding = sb.append(array[i] + " ").toString();
		}
		// adding element by element

		storing = adding.split(" ");
		System.out.println("Prime Anagrams are till 1000");
		System.out.println(" ");
		for (i = 0; i < storing.length; i++) {
			for (int j = i + 1; j < storing.length; j++) {
				// toString method is used for converting to String type
				compare1 = storing[i].toString();
				compare2 = storing[j].toString();
				// comparing and giving output here
				boolean status = Utility.isAnagram(compare1, compare2);
				if (status) {
					// System.out.println(""+storing[j]);
					refQ.enQueue(storing[i]);
					refQ.enQueue(storing[j]);
				}

			}
		}
		refQ.show();
	}
}
