package com.hcl.phmp.model;

import javax.validation.constraints.NotEmpty;

public class Login {
	@NotEmpty
private String userName;
	@NotEmpty
private String password;
	public Login() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Login [userName=" + userName + ", password=" + password + "]";
	}
	
}
