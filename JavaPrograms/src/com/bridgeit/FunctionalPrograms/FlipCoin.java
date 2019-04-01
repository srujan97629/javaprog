package com.bridgeit.FunctionalPrograms;

/******************************************************************************
 *  Compilation:  javac -FlipCoin.java
 *  Execution:    java - com.bridgeit.AlgorithmPrograms.FlipCoin
 *  
 *  Purpose: Print the output as how many times heads and tails and its percentage 
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   09-03-2019
 *
 ******************************************************************************/
import java.util.InputMismatchException;

import com.bridgeit.utilitypack.Utility;

public class FlipCoin {
	static int tails = 0;
	static int heads = 0;

	public static void main(String[] args) {
		System.out.println("Enter flip times");

		// receiving user input to flip the coin
		try {
			int f = Utility.sc.nextInt();
			for (int i = 1; i <= f; i++) {
				System.out.println("Enter 1 to flip coin");
				int start = Utility.sc.nextInt();
				if (start == 1) {
					// flip starts here by calling flip method
					flip();
				} else {
					System.err.println("enter valid credential");
					break;
				}
			}
			System.out.println("Percentage of tails is " + (float) tails / f);
			System.out.println("Percentage of heads is " + (float) heads / f);
		}

		catch (InputMismatchException e) {
			System.err.println("Please enter numbers only");
		}
	}

	public static void flip() {
		double start = Math.random();
		if (start < 0.5) {
			tails++;
			System.out.println("Tails" + tails);
		} else {
			heads++;
			System.out.println("Heads" + heads);
		}
	}
}
