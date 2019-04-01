package com.bridgeit.OopsPrograms;

/******************************************************************************
 *  Compilation:  javac -DataManagement.java
 *  Execution:    java - com.bridgeit.OopsPrograms.DataManagement
 *  
 *  Purpose: Print the details of products 
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   26-03-2019
 *
 ******************************************************************************/
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataManagement
{
   public static void main(String[] args) 
   {
	   String filePath="/home/admin1/eclipse-workspace/jsonfiles/datamanagement.json";
	   File file =new File(filePath);
	   ObjectMapper input = new ObjectMapper();
	   try
	   {
		JsonNode node=input.readTree(file);
		JsonNode rice=node.get("Rice");
		System.out.println("================= Rice Details ====================");
		for(JsonNode data:rice)
		{
			String name=data.path("Name").asText();
			int weight=data.path("Weight").asInt();
			int price=data.path("Price").asInt();
			System.out.println(" Name : "+name+"\n Price : "+price+"\n Weight : "+weight );
			System.out.println(" Total Price : "+price*weight +" Rs \n");
		}
		JsonNode node2=input.readTree(file);
		JsonNode pulses=node2.get("Pulses");
		System.out.println("================= Pulses Details ====================");
		for(JsonNode data:pulses)
		{
			String name=data.path("Name").asText();
			int weight=data.path("Weight").asInt();
			int price=data.path("Price").asInt();
			System.out.println(" Name : "+name+"\n Price : "+price+"\n Weight : "+weight );
			System.out.println(" Total Price : "+price*weight +" Rs \n");
		}
		JsonNode node3=input.readTree(file);
		JsonNode wheats=node3.get("Rice");
		System.out.println("================= Wheats Details ====================");
		for(JsonNode data:wheats)
		{
			String name=data.path("Name").asText();
			int weight=data.path("Weight").asInt();
			int price=data.path("Price").asInt();
			System.out.println(" Name : "+name+"\n Price : "+price+"\n Weight : "+weight );
			System.out.println(" Total Price : "+price*weight +" Rs \n");
		}
	   } 
	   catch (IOException e)
	   {		
		System.err.println("Please Give Valid File Details");
	   }
	   
   }
}
