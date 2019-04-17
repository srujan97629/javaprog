package com.bridgeit.AutowireDependencies;

public class ByTypeStudentDetails {
	private String name;
	private String surname;
	private int id;
	private Hostel hostel;

	public ByTypeStudentDetails() 
	{
       
	}

	public ByTypeStudentDetails(String name, String surname, int id, Hostel hostel) {

		this.name = name;
		this.surname = surname;
		this.id = id;
		this.hostel = hostel;
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

	public Hostel getHostel() {
		return hostel;
	}

	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}

	public void myInit() {
		System.out.println("Object created");
	}

	public void myDestroyed() {
		System.out.println("Object Destroyed");
	}

	@Override
	public String toString() {
		return "ByNameStudentDetails [name=" + name + ", surname=" + surname + ", id=" + id + ", hostel=" + hostel
				+ "]";
	}
	
	
}
