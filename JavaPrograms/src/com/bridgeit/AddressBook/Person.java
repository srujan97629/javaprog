package com.bridgeit.AddressBook;

public class Person 
{
	//Using Encapsulation 
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
   // Using getters and setters to pass the value and retrieve 
	public Person(String firstName, String lastName, String address, String city, 
			String state, String zip, String phoneNumber)
	{
		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
		setState(state);
		setCity(city);
		setZip(zip);
		setPhone(phoneNumber);
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Full Name: " + firstName + " ").append(lastName + "\n").append("Full Address: " + address + ", ").append(city + ", ")
		.append(state + ", ").append("Pin code: " + zip + "\n").append("Phone: " + phoneNumber + "\n");

		return sb.toString();
	}

	public String getFirstName() 
	{
		return firstName;
	}

	private void setFirstName(String firstName) 
	{
		{
			this.firstName = firstName;	
		}
	}

	public String getLastName() 
	{
		return lastName;
	}

	private void setLastName(String lastName) 
	{ 		
			this.lastName = lastName;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state) 
	{
		{
			this.state = state;	
		}

	}
	public String getZip() 
	{
		return zip;
	}
	public void setZip(String zip) 
	{		
		{
			this.zip = zip;	
		}
	}

	public String getPhone() 
	{
		return phoneNumber;
	}

	public void setPhone(String phone) 
	{			
			this.phoneNumber = phone;		
	}

	public String getCity() 
	{
		return city;
	}

	public void setCity(String city) 
	{
			this.city = city;	
	}

}
	
	
	

