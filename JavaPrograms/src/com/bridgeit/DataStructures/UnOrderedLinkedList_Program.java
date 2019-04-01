package com.bridgeit.DataStructures;

/******************************************************************************
 *  Compilation:  javac -UnOrderedLinkedList_Program.java
 *  Execution:    java - com.bridgeit.DataStructures.UnOrderedLinkedList_Program
 *  
 *  Purpose:   Read the Text from a file, split it into words and 
 *  arrange it as Linked List and print the output.
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   19-03-2019
 *
 ******************************************************************************/
import com.bridgeit.DataStructures.utility.LinkedList;
import com.bridgeit.utilitypack.Utility;

public class UnOrderedLinkedList_Program {
	
	public static void main(String[] args) throws Exception {

		final String path = "/home/admin1/Desktop/first";
		// creating object for linked list to store the data
		LinkedList<String> linked = new LinkedList<String>();
		String word[] = Utility.fileReadString(path);
		
		for (int i = 0; i < word.length; i++) {
			linked.add(word[i]);
		}
		// calling method to display the elements in the array
		linked.display();
		System.out.println("Enter the word that you want to search in the file");
		// user entering string
		String find = Utility.getString();
		// Searching the element
		if (linked.search(find)) {
			System.out.println("Word is found in the file");
			System.out.println("Removing the word from the file");
			// delete the element
			linked.delete(find);
			// Printing the numbers on screen
			linked.display();
			linked.writeOnFile();
		} else {
			System.err.println("Word is not found in the file");
			System.out.println("adding word to the file");
			System.out.println("");
			// adding the element
			linked.add(find);
			// Printing elements on the screen
			linked.display();
			linked.writeOnFile();
		}

	}
}
