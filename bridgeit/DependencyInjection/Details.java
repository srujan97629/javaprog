package com.bridgeit.DependencyInjection;

public class Details {
	private String village;
	private String mandal;
	private int pin;

	public Details() {

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

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Details [village=" + village + ", mandal=" + mandal + ", pin=" + pin + "]";
	}

}
