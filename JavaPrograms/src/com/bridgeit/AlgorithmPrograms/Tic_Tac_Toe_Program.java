
package com.bridgeit.AlgorithmPrograms;

/******************************************************************************
 *  Compilation:  javac - Tic_Tac_Toe_Program.java
 *  Execution:    java - com.bridgeit.AlgorithmPrograms.Tic_Tac_Toe_Program
 *  
 *  Purpose: To create a Tic_Toc_Toe game with one player as computer
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   16-03-2019
 *
 ******************************************************************************/

import java.util.Random;

import com.bridgeit.utilitypack.Utility;;

public class Tic_Tac_Toe_Program {
	// taking 2d array and passing 3 rows and 3 columns
	static String arr[][] = new String[3][3];
	static int row;
	static int col;

	public static void main(String[] args) {
		try {
			System.out.println("lets start the game");
			System.out.println("First turn is Computer");
			System.out.println("X---> is for Computer");
			System.out.println("0---> is for Player(user)");
			System.out.println("=========================================================");
			System.out.println("Board is ready to play");
			// Calling board method
			board();
			// Calling display method for show the game result to the user
			display(arr);
			System.out.println(playGame());
		} catch (Exception e) {
			System.err.println("Please Enter Valid Input");
		}
	}

	public static void display(String arr[][]) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void board() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				// assigning -- to array
				arr[i][j] = "-- ";
			}
		}
	}

	public static String playGame() {
		for (int i = 0; i < 5; i++) {
			System.out.println("it is computer turn");
			int count = 0;
			while (count == 0) {
				// Using random class because
				// it gives random numbers
				Random rd = new Random();
				row = rd.nextInt(3);
				col = rd.nextInt(3);
				if (arr[row][col] == "-- ") {
					count++;
					arr[row][col] = "x";
				}
				if (arr[0][0] == "x" && arr[0][1] == "x" && arr[0][2] == "x"
						|| arr[1][0] == "x" && arr[1][1] == "x" && arr[1][2] == "x"
						|| arr[2][0] == "x" && arr[2][1] == "x" && arr[2][2] == "x"
						|| arr[0][0] == "x" && arr[1][0] == "x" && arr[2][0] == "x"
						|| arr[0][1] == "x" && arr[1][1] == "x" && arr[2][1] == "x"
						|| arr[0][2] == "x" && arr[1][2] == "x" && arr[2][2] == "x"
						|| arr[0][0] == "x" && arr[1][1] == "x" && arr[2][2] == "x"
						|| arr[2][0] == "x" && arr[1][1] == "x" && arr[0][2] == "x") {
					display(arr);
					System.err.println(" ohhhh no!, loose the match Better luck next time ");
				}
				display(arr);
				System.out.println("==========================================================");
			}
			System.out.println(" It is users turn");
			System.out.println();
			count = 0;
			while (count == 0) {
				System.out.println("Enter row");
				row = Utility.getInteger();
				System.out.println("Enter col");
				col = Utility.getInteger();
				if (arr[row][col] == "-- ") {
					count++;
					arr[row][col] = "0";
				} else {
					System.out.println("Sorry place is occupied ");
					System.out.println(" Player cheating ");
					System.err.println("Exiting the game");
					System.exit(0);
				}
			}
			if (arr[0][0] == "0" && arr[0][1] == "0" && arr[0][2] == "0"
					|| arr[1][0] == "0" && arr[1][1] == "0" && arr[1][2] == "0"
					|| arr[2][0] == "0" && arr[2][1] == "0" && arr[2][2] == "0"
					|| arr[0][0] == "0" && arr[1][0] == "0" && arr[2][0] == "0"
					|| arr[0][1] == "0" && arr[1][1] == "0" && arr[2][1] == "0"
					|| arr[0][2] == "0" && arr[1][2] == "0" && arr[2][2] == "0"
					|| arr[0][0] == "0" && arr[1][1] == "0" && arr[2][2] == "0"
					|| arr[2][0] == "0" && arr[1][1] == "0" && arr[0][2] == "0") {
				display(arr);
				System.out.println("*** Winner Winner Chicken Dinner ***");
			}
			display(arr);
			System.out.println("======================================================");
		}
		return " *** Match Draw *** ";
	}

}
