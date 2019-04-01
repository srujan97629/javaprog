package com.bridgeit.AddressBook;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddressBookMenu 
{
	static AddressBook addressBook = new AddressBook();
	public static void main (String [] args)
	{
		//Using Scanner class to take input from user 
		Scanner scan=new Scanner(System.in);
		boolean stop=true;
		try {
			//  try for handling Exception 
			while(stop)
			{
				// Giving options for user 
				System.out.println("  Choose below choices");
				System.out.println("  ");
				System.out.println("  1. Create New Address Book");
				System.out.println("  2. Open existing Address Book");
				System.out.println("  3. Add Person Details");
				System.out.println("  4. Edit Person");
				System.out.println("  5. Remove Person from Address book");
				System.out.println("  6. Sort entries by name");
				System.out.println("  7. Sort entries by zip or pin");
				System.out.println("  8. Print entered details ");
				System.out.println("  9. Save Address Book ");
				System.out.println("  10. Save As Address Book");
				System.out.println("  11. Quit Program");

				int number=scan.nextInt();
				//Switch case is used to do particular work 
				switch(number)
				{
					case 1:	AddressBookController.createNewAddressBook();
							break;

					case 2: AddressBookController.openExistingAddressBook();						
							break;

					case 3: AddressBookController.addPersonInAddressBook();
							break;

					case 4:	AddressBookController.updatePersonInAddressBook();
							break;						

					case 5: AddressBookController.removePersonInAddressBook();
							break;

					case 6:	AddressBookController.sortAddressBookByName();
							break;

					case 7: AddressBookController.sortAddressBookByZip();
							break;

					case 8: AddressBookController.printAddressBook();
							break;

					case 9: AddressBookController.saveAddressBook();
							break;

					case 10: AddressBookController.saveAsAnotherAddressBook();		
							break;

					case 11: System.out.println("\n Application has been stopped \n");
					// To stop the application   
					         stop=false;
							break;
					default: System.err.println("Invalid choice... try again");
				}	
			}	
		}
		//Using catch block for null pointer exception 
		catch(NullPointerException e)
		{
			System.err.println("\nNo AddressBook opened currently ");
		}
		//Using this catch block for input miss match exception 
		catch(InputMismatchException e)
		{
			System.out.println("Please enter number only ");
		}
      scan.close();
	}

}

	
	
	

