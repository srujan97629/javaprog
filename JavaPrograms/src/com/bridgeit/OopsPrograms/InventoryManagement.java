package com.bridgeit.OopsPrograms;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class InventoryManagement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String filePath = "/home/admin1/eclipse-workspace/jsonfiles/datamanagement.json";
		File file = new File(filePath);

		ObjectMapper input = new ObjectMapper();
		int number;
		try 
		{
			JsonNode fileRead = input.readTree(file);
			// System.out.println(""+rootNode);
			do {
				System.out.println("Enter the product number");
				System.out.println(" 1:Rice" + "\n 2:Pulses" + "\n 3:Wheat");
				number = scan.nextInt();
			} while (number < 0 || number > 4);

			String productDetails = "";

			switch (number) {
			case 1:
				productDetails = "Rice";
				break;
			case 2:
				productDetails = "Pulses";
				break;
			case 3:
				productDetails = "Wheat";
				break;
			default:
				System.out.println("Invalid Input");

			}
			JsonNode inventory = fileRead.get(productDetails);	//reading the entered choice			
			for (JsonNode data : inventory)
			{		
				String name = data.path("Name").asText();
				int price = data.path("Price").asInt();
				int weight = data.path("Weight").asInt();

				System.out.println("Name:" + name + "\nPrice: " + price + "\nWeight: " + weight);
				System.out.println("Total Price : " + price * weight + " Rs" + "\n");
			}

		}
		catch (IOException |InputMismatchException e)
		{		
			System.err.println("Please Give Valid File Details");
	    }
		scan.close();
	}

}
	
