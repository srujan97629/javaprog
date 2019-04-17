package com.bridgeit.DependencyInjection;

public class UsingSetterEmployee {
	private String name;
	private String surname;
	private int id;
	private Details details;

	public UsingSetterEmployee() 
	{
		
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

	public Details getDetails() {
		return details;
	}

	public void setDetails(Details details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "UsingSetterEmployee [name=" + name + ", surname=" + surname + ", id=" + id + ", details=" + details
				+ "]";
	}

}
