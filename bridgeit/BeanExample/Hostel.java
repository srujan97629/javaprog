package com.bridgeit.BeanExample;

public class Hostel {
	private String name;
	private String area;

	public Hostel() {
		
	}

	public Hostel(String name, String area) {
		
		this.name = name;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Hostel [name=" + name + ", area=" + area + "]";
	}
	
	
}
