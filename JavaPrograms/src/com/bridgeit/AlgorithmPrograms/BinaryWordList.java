package com.bridgeit.AlgorithmPrograms;

/******************************************************************************
 *  Compilation:  javac -d bin BinaryWordList.java
 *  Execution:    java -cp bin com.bridgeit.AlgorithmPrograms.BinaryWordList
 *  
 *  Purpose: To get the result searched string is present in the file or not 
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   15-03-2019
 *
 ******************************************************************************/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.bridgeit.utilitypack.Utility;

public class BinaryWordList {

	public static void main(String[] args) throws IOException {
		String[] arr = new String[100];
		// read the elements from the file
		BufferedReader file = new BufferedReader(new FileReader("/home/admin1/Desktop/first"));
		String str = "";
		StringBuffer sb = new StringBuffer();
		int i;
		// To store the elements in string buffer class
		while ((i = file.read()) != -1) {
			char ch = (char) i;
			str = Character.toString(ch);
			sb = sb.append(str);
		}
		System.out.println("Elements in text file :");
		System.out.println("");
		System.out.println(sb);

		String str1 = sb.toString();
		arr = str1.split(" ");
		Arrays.sort(arr);
		System.out.println("Enter the string to search :");
		String input = Utility.sc.next();

		int result = Utility.binarySearchMethodString(arr, input);

		if (result == -1) {
			System.err.println("Element not found");

		} else {
			System.out.println(input + " is found in the file ");
		}
		file.close();
	}
}
