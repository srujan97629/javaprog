package com.bridgeit.AutowireDependencies;

public class Address {
	private String village;
	private String area;
	private int pin;

	public Address() {

	}

	public Address(String village, String area, int pin) {

		this.village = village;
		this.area = area;
		this.pin = pin;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [village=" + village + ", area=" + area + ", pin=" + pin + "]";
	}

}
