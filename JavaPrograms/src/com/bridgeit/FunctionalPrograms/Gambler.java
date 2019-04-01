package com.bridgeit.FunctionalPrograms;

import java.util.InputMismatchException;

/******************************************************************************
 *  Compilation:  javac -Gambler.java
 *  Execution:    java - com.bridgeit.AlgorithmPrograms.Gambler
 *  
 *  Purpose: Print the output as how many times he played a match and 
 *           win and loss percentage 
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   09-03-2019
 *
 ******************************************************************************/
import com.bridgeit.utilitypack.Utility;

public class Gambler {
	public static void main(String[] args) {
		try {

			// Calling startGame method to give out put
			System.out.println("Enter stack of $");
			// Taking input as stack amount
			int stack = Utility.getInteger();
			// Taking input as goal amount
			System.out.println("Enter your goal to reach");
			int goal = Utility.getInteger();
			startGame(stack, goal);
		} catch (InputMismatchException e) {
			System.err.println("Please enter number only");
		}
	}

	/**
	 * @purpose Gambler game program
	 */
	public static void startGame(int stack, int goal) {
		int win = 0, loss = 0, bet = 0;

		while (stack != 0 && stack != goal) {
			bet++;
			// Using math.random() to get the values randomly in between 0.1-0.99
			double start = Math.random();
			if (start <= 0.5) {
				win++;
				stack++;
			} else {
				loss++;
				stack--;
			}
		} // ending while loop
		System.out.println("Number of wins " + win);
		System.out.println("Total bets " + bet);
		System.out.println("win percentage = " + ((float) win / bet) * 100);
		System.out.println("loss percentage = " + ((float) loss / bet) * 100);
		// printing final stack amount
		System.out.println("Remaining stack amount =" + stack);
	}

}
