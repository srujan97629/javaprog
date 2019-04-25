package com.bridgeit.App.Model;

public class Login {
	
	private String username;
	private String pass;

	public String getUsername() {
		return username;
	}

	public String getPass() {
		return pass;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Login [username=" + username + ", pass=" + pass + "]";
	}

}
