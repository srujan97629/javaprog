package com.bridgeit.DependencyInjection;

public class UsingConPerson {
	private String name;
	private String surname;
	private int id;
	private Address address;

	public UsingConPerson() 
	{
		
	}
	@Override
	public String toString() {
		return "UsingConPerson [name=" + name + ", surname=" + surname + ", id=" + id + ", ddress=" + address + "]";
	}
	public UsingConPerson(Address address)
	{
       this.address=address;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
