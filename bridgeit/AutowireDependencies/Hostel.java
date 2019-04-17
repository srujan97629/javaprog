package com.bridgeit.AutowireDependencies;

public class Hostel {
	private String hostelName;
	private String area;
	private int rating;

	public Hostel() {

	}

	public Hostel(String hostelName, String area, int rating) {
		super();
		this.hostelName = hostelName;
		this.area = area;
		this.rating = rating;
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Hostel [hostelName=" + hostelName + ", area=" + area + ", rating=" + rating + "]";
	}

}
