package com.bridgeit.DataStructures;

/******************************************************************************
 *  Compilation:  javac -AnagramStack.java
 *  Execution:    java - com.bridgeit.DataStructures.AnagramStack
 *  
 *  Purpose: Checks given String is Anagram or not and gives the output 
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   20-03-2019
 *
 ******************************************************************************/
import com.bridgeit.DataStructures.utility.StackGenerics;
import com.bridgeit.utilitypack.Utility;

public class AnagramStack
{

	public static void main(String[] args) 
	{
		StackGenerics<String> stackList = new StackGenerics<String>(167);
		int i;
		String compare1=" ";
		String compare2=" ";
		String adding=" ";	
		//Storing prime numbers in array array
		int array[]=Utility.primeNumber();
		// Creating String array by passing length of the (array)
		String[] storing=new String[array.length];		
		StringBuffer sb=new StringBuffer(array.length);				
		for(i=0;i<array.length;i++)
		{
			// We cannot convert integers toString so by using String buffer 
			//class we are converting 
			adding=sb.append(array[i]+" ").toString();
		}
		//adding element by element
		
		storing=adding.split(" ");		
		System.out.println("Prime Anagrams are till 1000");
		System.out.println(" ");
			for(i=0;i<storing.length-1;i++)
			{
				for(int j=i+1;j<storing.length-1;j++)
				{
					// toString method is used for converting to String type
					compare1=storing[i].toString();
					compare2=storing[j].toString();
					//comparing and giving output here
					boolean status=Utility.isAnagram(compare1, compare2);
				if (status)
				{	
					//Storing into Stack
					stackList.push(storing[i]);
					stackList.push(storing[j]);
				}
			}
		}
		System.out.println(" ");
		System.out.println(" Reverse  :");
		for (i = 0; i < StackGenerics.size; i++)
		{
			stackList.pop();			
		}

	}

}

	
	
	

