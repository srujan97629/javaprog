package com.bridgeit.App.Model;

public class User {
	private String firstname;
	private String lastname;
	private String gender;
	private String mobilenumber;
	private String username;
	private String emailid;
	private String pass;

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getGender() {
		return gender;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public String getUsername() {
		return username;
	}

	public String getEmailid() {
		return emailid;
	}

	public String getPass() {
		return pass;
	}

	public void setFristname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender + ", mobilenumber="
				+ mobilenumber + ", username=" + username + ", emailid=" + emailid + ", pass=" + pass + "]";
	}
	

}
