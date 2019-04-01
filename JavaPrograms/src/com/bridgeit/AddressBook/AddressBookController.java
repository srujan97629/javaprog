package com.bridgeit.AddressBook;


import java.util.Scanner;

public class AddressBookController
{
	static AddressBook addressBook = new AddressBook();
	static Scanner scan=new Scanner(System.in);
    // This method used for create new address book   
	public static void createNewAddressBook()
	{
		String response = null;
		if(addressBook.getFile() != null)
		{

			System.out.println("\nAn existing AddressBook is already opened "
					+ "\n Do you really wish to exit? \n (reply with 'yes' or 'no'): ");
			response = scan.nextLine().toLowerCase();
		}
		if(addressBook.getFile() == null || response.equals("yes"))
		{
			//Calling method to store details 
			addressBook.createAddressBook();
		}
		else if(response.equals("no"))
		{
			System.out.println("\nThank you! continue with existing file... \n");

		}
		else
		{
			System.out.println("\n Invalid response ");
		}
	}
	public static void openExistingAddressBook()
	{
		String response = null;
		//Checking file is empty or not 
		if(addressBook.getFile() != null)
		{
			System.out.println("\nAn existing AddressBook is already opened!"
					+ "\n Do you really wish to exit? \n (reply with 'yes' or 'no'): ");
			response = scan.nextLine().toLowerCase();
		}
		if(addressBook.getFile() == null || response.equals("yes"))
		{
			addressBook.openAddressBook();
			System.out.println();
		}
		else if(response.equals("no"))
		{
			System.out.println("\nThank you! continue with existing file... \n"
					+ " don't forget to save the changes \n");
		}
		else
		{
			System.out.println("\ninvalid response!\n");
		}
	}

	public static void addPersonInAddressBook()
	{
		if(addressBook.getFile() != null)
		{
			System.out.println("Enter the first name:");
			//Using toUpperCase to convert  alphabets lower case to upper case 
			String firstName = scan.nextLine().toUpperCase();
			System.out.println("Enter the last name:");
			String lastName = scan.nextLine().toUpperCase();
			System.out.println("enter the address:");
			String address = scan.nextLine().toUpperCase();
			System.out.println("enter the city:");
			String city = scan.nextLine().toUpperCase();
			System.out.println("Enter the state:");
			String state = scan.nextLine().toUpperCase();
			System.out.println("Enter the zip or pin");
			String zip = scan.nextLine();
			System.out.println("Enter the Phone Number ");
			String phone = scan.nextLine();
            //Calling method to pass the values 
			addressBook.addPerson(firstName, lastName, address, city, state, zip, phone);	
		}
		else
		{
			System.out.println("\n No Address Book linked Create one or open existing..\n");
		}
	}

	public static void updatePersonInAddressBook()
	{
		if(addressBook.getFile() != null)
		{
			System.out.println("search person by first name: ");
			String searchName = scan.nextLine().toUpperCase();
			int index = addressBook.searchPersonbyFirstName(searchName);
			if(index >= 0)
			{
				System.out.println("Enter the address : ");
				String address = scan.nextLine().toUpperCase();
				System.out.println("Enter the city : ");
				String city = scan.nextLine().toUpperCase();
				System.out.println("Enter the State : ");
				String state = scan.nextLine().toUpperCase();
				System.out.println("Enter the zip : ");
				String zip = scan.nextLine();
				System.out.println("Enter the phone : ");
				String phone = scan.nextLine();
                // calling updatePerson method for pass the values  
				addressBook.updatePerson(index, address, city, state, zip, phone);
			}
			else
			{
				System.err.println("\n Soory Person not found!\n");
			}
		}
		else
		{
			System.err.println("\nNo Address Book linked! Create one or open existing..\n");
		}
	}
	public static void removePersonInAddressBook()
	{
		if(addressBook.getFile() != null)
		{
			System.out.println("Search person by first name : ");
			String searchName = scan.next().toUpperCase();
			int index = addressBook.searchPersonbyFirstName(searchName);
			if(index >= 0)
			{
				//Deleting the person info
				addressBook.removePerson(index);
				System.out.println("Person Deleted Successfully ");
			}
			else
			{
				System.out.println("\n Sorry Person not Found!\n");
			}
		}
		else
		{
			System.out.println("\n No Address Book linked by this name \n");
		}
	}

	public static void sortAddressBookByName()
	{
		if(addressBook.getFile() != null)
		{
			addressBook.sortByName();
		}
		else
		{
			System.out.println("\nNo Address Book linked! Create one or open existing..\n");
		}	
	}

	public static void sortAddressBookByZip()
	{
		if(addressBook.getFile() != null)
		{
			addressBook.sortByZip();
		}
		else
		{
			System.out.println("\nNo Address Book linked! Create one or open existing..\n");
		}	
	}

	public static void printAddressBook()
	{
		if(addressBook.getFile() != null)
		{
			System.out.println("\n=================== " + "File Name : "+ addressBook.getFileName() + " ===================\n");
			addressBook.printAll();
			System.out.println("================== End of this AddressBook ==================\n" );
		}
		else
		{
			System.err.println("\nNo Address Book linked! Create one or open existing..\n");
		}	
	}

	public static void saveAddressBook()
	{
		if(addressBook.getFile() != null)
		{
			AddressInterface.saveFile(addressBook.getFile());
			System.out.println("\nAddressBook Saved Successfully!\n");
		}
		else
		{
			System.err.println("\nNo Address Book linked  Create one or open existing..\n");
		}	
	}

	public static void saveAsAnotherAddressBook()
	{
		if(addressBook.getFile() != null)
		{
			System.out.println("enter the file name: ");
			String fileName = scan.nextLine();
			System.out.println("enter the file extension: ");
			String fileExt = scan.nextLine();
			if(fileExt.equals(".json") || fileExt.equals(".txt"))
			{
				AddressInterface.saveFile(FileSystem.createNewFile(fileName, fileExt));
				System.out.println("\nAddressBook Saved to another file successfully!\n");
			}
		}
		else
		{
			System.err.println("\nNo Address Book linked! Create one or open existing..\n");
		}	
	} 
}

	
	
	

