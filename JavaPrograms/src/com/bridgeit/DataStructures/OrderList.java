package com.bridgeit.DataStructures;

/******************************************************************************
 *  Compilation:  javac -OrderList.java
 *  Execution:    java - com.bridgeit.DataStructures.OrderList
 *  
 *  Purpose: Arrange the elements in order by using linkedlist 
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   19-03-2019
 *
 ******************************************************************************/
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import com.bridgeit.DataStructures.utility.LinkedList;
import com.bridgeit.utilitypack.Utility;

public class OrderList {
	public static void main(String[] args) throws IOException {
		String path = "/home/admin1/Desktop/secound";
		LinkedList<Integer> list = new LinkedList<Integer>();
		int[] number = Utility.readFileInteger(path);
		Arrays.sort(number);
		for (int i = 0; i < number.length; i++) {
			list.add(number[i]);
		}
		list.display();
		System.out.println("Enter the value you want to search in file");
		// Taking user input to search
		try {

			final int input = Utility.getInteger();
			// calling search method to check condition
			if (list.search(input))
			{
				System.out.println(input + " value is found in file");
				System.out.println("removing word from flie");
				// deleting the word
				list.delete(input); 
				list.display();
			} else {
				System.out.println(input + " Word is not found in file");
				System.out.println("Adding word to the file");
				// adding element to object
				list.add(input);
				list.display();
				//list.writeOnFile();
			}
		} catch (InputMismatchException e) {
			System.err.println("Please enter numbers only");
		}

	}
}
