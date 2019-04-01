package com.bridgeit.DataStructures;

/******************************************************************************
 *  Compilation:  javac -BinarySearchTree.java
 *  Execution:    java - com.bridgeit.DataStructures.BinarySearchTree
 *  
 *  Purpose:  How many trees can be created using nodes
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   23-03-2019
 *
 ******************************************************************************/
import com.bridgeit.utilitypack.Utility;

public class BinarySearchTree {

	public static void main(String[] args) {
		// Taking value from user using inbuilt method
		System.out.println("Enter a number");
		try {
			int n = Utility.getInteger();
			//formula for get output 
			long value = ((factorial1(n)) / (factoria12(n) * factorial(n)));
			System.out.println(value + " Trees can be created using" + n+" Nodes");
		} catch (Exception e) {
			System.err.println("Enter number only");
		}
	}

	static long factorial1 = 1;
	static long factorial2 = 1;
	static long factorial3 = 1;

	public static long factorial(long n) {

		for (int i = 1; i <= n; i++) {
			factorial1 = i * factorial1;
		}
		//Returning value 
		return factorial1;
	}

	public static long factorial1(long n) {
		long n1 = 2 * n;
		for (int i = 1; i <= n1; i++) {
			factorial2 = i * factorial2;
		}
		//Returning value  
		return factorial2;
	}

	public static long factoria12(long n) {
		long n2 = n + 1;
		for (int i = 1; i <= n2; i++) {
			factorial3 = i * factorial3;
		}
		//Returning value 
		return factorial3;
	}

}
