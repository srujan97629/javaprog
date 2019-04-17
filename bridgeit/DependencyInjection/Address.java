package com.bridgeit.DependencyInjection;

public class Address {
	private String village;
	private String mandal;
	private String pin;

	public Address() {

	}

	public Address(String village, String mandal, String pin) {

		this.village = village;
		this.mandal = mandal;
		this.pin = pin;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getMandal() {
		return mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [village=" + village + ", mandal=" + mandal + ", pin=" + pin + "]";
	}
}
