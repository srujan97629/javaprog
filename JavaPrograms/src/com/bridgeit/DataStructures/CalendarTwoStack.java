package com.bridgeit.DataStructures;

/******************************************************************************
 *  Compilation:  javac -CalendarTwoStack.java
 *  Execution:    java - com.bridgeit.DataStructures.CalendarTwoStack
 *  
 *  Purpose: Calendar Details
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   23-03-2019
 *
 ******************************************************************************/
import com.bridgeit.DataStructures.utility.StackLinked;
import com.bridgeit.utilitypack.Utility;

public class CalendarTwoStack {
	static int arr[][] = new int[6][7];

	public static void main(String[] args) {
		StackLinked Stack = new StackLinked();
		StackLinked Stack1 = new StackLinked();
		int daysInMonth = 0;
		// Converting string to integer
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);

		String[] months = { "", "January", "February", "March", "April", "May", " June", "July", "August", "September",
				"October", "November", "December" };
		int[] date = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// Calling day method for counting days in a month
		int days = Utility.day(month, year);
		// Declaring days in a month
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			daysInMonth = 31;

		}
		// Declaring days in a month
		else if (month == 4 || month == 6 || month == 9 || month == 12) {
			daysInMonth = 30;
		}
		// Calling leap year function to know the leap year or not
		else if (month == 2) {
			if (Utility.isLeapYear(year)) {
				// if given year is leap year days are 28
				daysInMonth = 28;
			} else {
				daysInMonth = 29;
			}
		}
		int count = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = days; j < 7; j++) {
				if (count <= daysInMonth) {
					arr[i][j] = count;
					// pushing the numbers into array
					Stack.push(arr[i][j]);
					count++;

				} else {
					break;
				}
			}
			days = 0;
		}
		System.err.println("  " + months[month] + " " + "   " + year);
		System.out.println("          ");
		System.out.println("           ");
		for (int i = 1; i <= daysInMonth; i++) {
			Stack1.push(Stack.pop());
		}
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		System.out.println("   ");
		// Printing dates on console
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (arr[i][j] == 0) {
					System.out.print("\t");
				} else if (arr[i][j] > 9) {
					int value = (int) Stack1.pop();
					System.out.print(+value + "\t");
				} else {
					int value = (int) Stack1.pop();
					System.out.print(+value + "\t");
				}
			}
			System.out.println();
		}

	}
}
