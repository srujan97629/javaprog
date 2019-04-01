package com.bridgeit.DataStructures;

/******************************************************************************
 *  Compilation:  javac -BankCashCounter.java
 *  Execution:    java - com.bridgeit.DataStructures.BankCashCounter
 *  
 *  Purpose: Storing account holder details and add amount to acount and withdraw 
 *   from your account and shows how many users in bank.
 *
 *  @author  Srujan Madipeddi
 *  @version 1.0
 *  @Date   19-03-2019
 *
 ******************************************************************************/
import java.util.Scanner;

public class BankCashCounter 
{
	public static void main(String[] args)
	{
        //Creating object for using that class statements into tjid class
		BankQ refBank = new BankQ(100);
        //Taking user input
		Scanner sc = new Scanner(System.in);
		String out = "";
		int number;
		// Head for the console
		System.out.println("\t\t\t Bank Details");
		do {
			System.out.println("            ");
			System.out.print(" 1. To Add person name");
			System.out.println("\t 2. To Add or withdraw your amount");
			System.out.println("          ");
			System.out.println("\t\t 3. To Total customers in Bank");
			number = sc.nextInt();
			//Using switch case because we have give 3 option for user 
			switch (number) 
			{
			case 1:
				//Adding details 
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter customer name");
				//Adding  person  name 
				out = sc1.nextLine();
				BankQ.enqueue(out);
				break;

			case 2:
				//Adding money or withdraw statements
				Scanner sc3 = new Scanner(System.in);
				System.out.println("Account Holder Name:" + BankQ.peek());
				System.out.println("Enter 1 to add money and 2 to withdraw the money");
				int m = sc3.nextInt();
				BankQ.trancation(m);
				//After completing transaction removing account holder 
				System.out.println("dequeue");
				BankQ.dequeue();
				System.out.println("Account Holder Name :" + BankQ.peek());
				break;
			case 3:
				//Printing total customers added into bank 
				System.out.println("size:" + BankQ.count);
				BankQ.queueDisplay();
				break;
			default:
				System.out.println("Sorry enter valid credential ");
			}
		} while (number > 0 && number <= 3);
		//Closing costly resources
      sc.close();
	}
}
