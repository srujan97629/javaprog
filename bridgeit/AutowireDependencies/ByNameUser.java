package com.bridgeit.AutowireDependencies;

public class ByNameUser {
	private String name;
	private String surname;
	private String mobileNumber;
	private Address address;

	public ByNameUser() {
		
	}

	public ByNameUser(String name, String surname, String mobileNumber, Address address) {

		this.name = name;
		this.surname = surname;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	public void myInit()
	{
		System.out.println("Object Created");
	}
	public void myDestroyed()
	{
		System.out.println("Object Destroyed");
	}

	@Override
	public String toString() {
		return "ByTypeUser [name=" + name + ", surname=" + surname + ", mobileNumber=" + mobileNumber + ", address="
				+ address + "]";
	}

}
