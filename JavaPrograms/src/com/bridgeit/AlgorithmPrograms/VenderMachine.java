package com.bridgeit.AlgorithmPrograms;

/******************************************************************************
 *  Compilation:  javac -d bin VenderMachine.java
 *  Execution:    java -cp bin com.bridgeit.AlgorithmPrograms.VenderMachine
 *  
 *  Purpose: To count the notes by VenderMachine by taking input amount from user. 
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   13-03-2019
 *
 ******************************************************************************/
import java.util.InputMismatchException;

import com.bridgeit.utilitypack.Utility;

public class VenderMachine {
	public static void main(String[] args) {
		System.out.println("Enter amount ");
		// using try catch for inputmismatch exception
		try {
			// Taking amount from user
			int amount = Utility.getInteger();
			venderMachine(amount);
		} catch (InputMismatchException e) {
			System.err.println("Enter valid amount ");
		}
	}

	public static void venderMachine(int amount) {
		int notes = 0;
		int[] money = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
		for (int i = 0; i <= money.length - 1; i++) {
			if (amount / money[i] > 0) {
				System.out.println(money[i] + " Rupees notes are " + amount / money[i]);
				notes = notes + amount / money[i];
				amount = amount % money[i];
			}
		}
		System.out.println("Total notes are given by vender machine is " + notes);
	}

}
