/**
 * 
 */
package com.hcl.phmp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * @author kowshik.kotha
 *
 */
@Entity
@Table(name="patient_profile")
public class Profile {
@Id
@Column(name="userName")
@NotEmpty
private String userName;
@NotEmpty
@Column
private String password;
@NotEmpty
@Column
private String dateOfBirth;
@NotEmpty
@Column
private String email;
@NotEmpty
@Column
private String contactNumber;
@NotEmpty
@Column
private String address;
@NotEmpty
@Column
private String city;
@NotEmpty
@Column
private String country;
@NotEmpty
@Column
private int pinCode;
@NotEmpty
@Column
private String gender;
@NotEmpty
@Column
private String gaurdianFistName;
@NotEmpty
@Column
private String GaurdianLastName;


	
	public Profile() {
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



	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}



	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}



	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}



	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}



	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}



	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}



	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}



	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}



	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}



	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}



	/**
	 * @return the pinCode
	 */
	public int getPinCode() {
		return pinCode;
	}



	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}



	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}



	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}



	/**
	 * @return the gaurdianFistName
	 */
	public String getGaurdianFistName() {
		return gaurdianFistName;
	}



	/**
	 * @param gaurdianFistName the gaurdianFistName to set
	 */
	public void setGaurdianFistName(String gaurdianFistName) {
		this.gaurdianFistName = gaurdianFistName;
	}



	/**
	 * @return the gaurdianLastName
	 */
	public String getGaurdianLastName() {
		return GaurdianLastName;
	}



	/**
	 * @param gaurdianLastName the gaurdianLastName to set
	 */
	public void setGaurdianLastName(String gaurdianLastName) {
		GaurdianLastName = gaurdianLastName;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profile [userName=" + userName + ", password=" + password + ", dateOfBirth=" + dateOfBirth + ", email="
				+ email + ", contactNumber=" + contactNumber + ", address=" + address + ", city=" + city + ", country="
				+ country + ", pinCode=" + pinCode + ", gender=" + gender + ", gaurdianFistName=" + gaurdianFistName
				+ ", GaurdianLastName=" + GaurdianLastName + "]";
	}

}
