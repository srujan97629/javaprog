package com.bridgeit.OopsPrograms;

/******************************************************************************
 *  Compilation:  javac -RegularExpression.java
 *  Execution:    java - com.bridgeit.OopsPrograms.RegularExpression
 *  
 *  Purpose: To read stock names and prices  and to calculate the total value of stock    
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   27-03-2019
 *
 ******************************************************************************/
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class StockReport {

	private List<Stocks> stacks;

	public List<Stocks> getStocks() {
		return stacks;
	}
	public void setStocks(List<Stocks> stacks) {
		this.stacks = stacks;
	}
	public static void main(String[] args) {
		//Using scanner class to take input from user 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of stocks");
		
		int number = scan.nextInt();
		try {
			// Using try for handling the exception 
			Scanner scan2 = new Scanner(System.in);
			//Using objectMapper class to read the file or to write details into file  
			ObjectMapper mapper = new ObjectMapper();
			List<Stocks> stocksRef = new ArrayList();

			for (int i = 0; i < number; i++) 
			{							
				System.out.println("Enter the name of stack holder");
				String personName = scan2.nextLine();
				System.out.println("Enter the company name");
				String company = scan2.nextLine();
				System.out.println("Enter the Symbol of company");
				String symbol = scan2.nextLine();
				System.out.println("Enter the number of shares");
				int shares = scan2.nextInt();
				System.out.println("Enter the price");
				int price = scan2.nextInt();
				int totalprice = shares * price;
				System.out.println("The total price is:" + totalprice);
				System.out.println("Done");
				System.out.println();

				Stocks stack = new Stocks();
				//Passing the values to Stack 
				stack.setName(personName);
				stack.setCompany(company);
				stack.setSymbol(symbol);
				stack.setShares(shares);
				stack.setPrice(price);
				stack.setTotalprice(totalprice);
				stocksRef.add(stack);
			}
			//Writing details into file 
			mapper.writeValue(new File("/home/admin1/eclipse-workspace/jsonfiles/stacks.json"), stocksRef);

			StockReport stock = new StockReport();
			stock.setStocks(stocksRef);
            // Using for each loop printing values on to the console 
			for (Stocks s : stock.getStocks()) {
				System.out.println("User Name:" + s.getName() + "\nCompany Name:" + s.getCompany() + "\nCompany Symbol:"
						+ s.getSymbol() + "\nShares:" + s.getShares() + "\nPrice:" + s.getPrice() + "\nTotal Price:"
						+ s.getTotalprice() + "\n");
			}
			//Closing costly resources
			scan.close();
		} catch (IOException e) {
			System.out.println("" + e.getMessage());
			e.printStackTrace();
		}
      
	}

}

	
	
	
