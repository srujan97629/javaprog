package com.bridgeit.OopsPrograms;

/******************************************************************************
 *  Compilation:  javac -RegularExpression.java
 *  Execution:    java - com.bridgeit.OopsPrograms.RegularExpression
 *  
 *  Purpose: Replacing invalid details with valid details    
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   26-03-2019
 *
 ******************************************************************************/
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RegularExpression
{
    public static void main(String[] args)
    {
		// giving file path 
    	String filePath="/home/admin1/eclipse-workspace/jsonfiles/regularexpression.json";
	    File expressionFile=new File(filePath);
	    //Using objectMapper class to read the file or to write details into file  
		ObjectMapper input=new ObjectMapper();
		Scanner scan= new Scanner(System.in);
		//Scanner class is used for taking user input 
		try
		{
			//Read the details from file by using readTree method 
			JsonNode filRead =input.readTree(expressionFile);
			JsonNode expression=filRead.get("RegularExpression");
			String regularExpression=expression.asText("RegularExpression");
			//Printing details on console 
			System.out.println(regularExpression);
			System.out.println("Enter your name ");
			String name=scan.nextLine();
			if(Pattern.matches("[a-zA-Z]+", name))
			{
				regularExpression=regularExpression.replaceAll("<<name>>", name);						
			}
			else
			{
				System.err.println("You entered wrong details at name ");
			}
			System.out.println("Enter your full name ");
			String fullName=scan.nextLine();
			//Using regular expressions 
			if(Pattern.matches("[a-zA-Z]+", fullName))
			{
				regularExpression=regularExpression.replaceAll("<<full name>>", fullName);						
			}
			else
			{
				System.err.println("You entered wrong details at mobilenumber ");
			}
			System.out.println("Enter your mobile number ");
		    String number=scan.next();
			if(Pattern.matches("[789][0-9]{9}+", number))
			{
				regularExpression=regularExpression.replaceAll("xxxxxxxxxx", number);						
			}
			else
			{
				System.err.println("You entered wrong details at mobilenumber ");
			}
			//using date class we get the today date 
			Date todayDate=new Date();
			// To get format we using simpleDateFormat method . 
			SimpleDateFormat datefar=new SimpleDateFormat("dd/MM/yyyy");
			String date=datefar.format(todayDate);
			regularExpression=regularExpression.replaceAll("01/01/2016", date);									
			System.out.println(regularExpression);
		}
		//To catch the exception 
		catch (IOException e)
		{			
			System.err.println("Please Give Valid File Details");
		} 
		scan.close();
    
    }
}
