package com.bridgeit.DataStructures;

/******************************************************************************
 *  Compilation:  javac -Calendar.java
 *  Execution:    java - com.bridgeit.DataStructures.Calendar
 *  
 *  Purpose: Calendar Details
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   23-03-2019
 *
 ******************************************************************************/
import com.bridgeit.utilitypack.Utility;

public class Calendar
{

	public static void main(String[] args)
	{
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] date = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		//Converting String to integer
		int month = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
        //Checking give year is leap year or not 
		if (month == 2 && Utility.isLeapYear(year)) 
		{
			date[month] = 29;
		}
        // Using inbuilt method for week decision
		int day = Utility.day(month, 1, year);
		int arr[][] = new int[6][7];
		// date start from 1  
		int z= 1;

		for (int i = 0; i < 6; i++) 
		{
			for (int j = day; j < 7; j++)
			{
				if (z <= date[month]) 
				{
					arr[i][j] = z;
					z++;					
				}
			}
			day = 0;
		}		
		System.out.println(" " + months[month] + " " + d + " " + year);
		System.err.println(" Sun  Mon Tue Wed Thu Fri Sat ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				if (arr[i][j] != 0)
				{
					//Using printf statement for alignment on console
					System.out.printf("%4d", arr[i][j]);
				}
				else {
					System.out.printf("    ");
				}
			}
			System.out.println();
		}

	}

}

	
	

