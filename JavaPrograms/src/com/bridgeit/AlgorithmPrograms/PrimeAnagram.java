
package com.bridgeit.AlgorithmPrograms;

/******************************************************************************
 *  Compilation:  javac -d bin PrimeAnagram.java
 *  Execution:    java -cp bin com.bridgeit.AlgorithmPrograms.PrimeAnagram
 *  
 *  Purpose: giving the output primeAnagaram numbers
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   16-03-2019
 *
 ******************************************************************************/
import com.bridgeit.utilitypack.Utility;

public class PrimeAnagram 
{
	public static void main(String[] args)
	{
		int i;
		String compare1=" ";
		String compare2=" ";
		String adding=" ";	
		//Storing prime numbers in arr array
		int arr[]=Utility.primeNumber();
		// Creating String array by passing length of the (arr)
		String[] storing=new String[arr.length];		
		StringBuffer sb=new StringBuffer(arr.length);				
		for(i=0;i<arr.length;i++)
		{
			// We cannot convert integers toString so by using String buffer 
			//class we are converting 
			adding=sb.append(arr[i]+" ").toString();
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
					
					if(status)
					{
						System.out.println(""+storing[i]+" and "+storing[j]);
							
					}
					
				}
				
			}
		
		}
	}


