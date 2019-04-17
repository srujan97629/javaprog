package com.bridgeit.BeanFactoryPrograms;

public class Employee {
	// Attributes
	private int eId;
	private String eName;
	private String eAddress;

	// Default constructor
	public Employee() {

	}

	public Employee(int eId, String eName, String eAddress) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eAddress = eAddress;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteAddress() {
		return eAddress;
	}

	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eAddress=" + eAddress + "]";
	}

}
