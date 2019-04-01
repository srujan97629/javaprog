package com.bridgeit.FunctionalPrograms;

/******************************************************************************
 *  Compilation:  javac -StringReplace.java
 *  Execution:    java - com.bridgeit.AlgorithmPrograms.StringReplace
 *  
 *  Purpose: Replace the string   
 *           
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   09-03-2019
 *
 ******************************************************************************/
import com.bridgeit.utilitypack.Utility;

public class StringReplace 
{
   public static void main(String[] args)
   {
	String given="Hello <<UserName>>, How are you?";
	//to store string after replacing
	String change="";
	System.out.println("Enter your name");
	//Receiving  user input
	String name=Utility.sc.next();
	if(name.length()>3)
	{
      change=given.replace("<<UserName>>",name );
      System.out.println(change);
	}
	else
	{
	  System.err.println("Please enter valid Name, name characters should be above 3 characters ");
	  main(args);
	}
   }
}
