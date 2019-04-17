package com.bridgeit.ApplicationContext;

public class StudentDetails {
	// Attributes
	private int id;
	private String name;
	private int section;
	private String address;

	// Default constructor
	public StudentDetails() {

	}

	public StudentDetails(int id, String name, int section, String address) {
	
		this.id = id;
		this.name = name;
		this.section = section;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", section=" + section + ", address=" + address + "]";
	}

}
