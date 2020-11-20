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
@Column
private int pinCode;
@NotEmpty
@Column
private String gender;
@Column
private String guardianFirstName;
@Column()
private String guardianLastName;

	
	public Profile() {
		//default constructor.
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
	 * @return the guardian_FirstName
	 */
	public String getGuardianFirstName() {
		return guardianFirstName;
	}



	/**
	 * @param guardian_FirstName the guardian_FirstName to set
	 */
	public void setGuardianFirstName(String guardianFirstName) {
		this.guardianFirstName = guardianFirstName;
	}



	/**
	 * @return the guardian_LastName
	 */
	public String getGuardianLastName() {
		return guardianLastName;
	}



	/**
	 * @param guardian_LastName the guardian_LastName to set
	 */
	public void setGuardianLastName(String guardianLastName) {
		this.guardianLastName = guardianLastName;
	}



	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}



	
	


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profile [userName=" + userName + ", password=" + password + ", dateOfBirth=" + dateOfBirth + ", email="
				+ email + ", contactNumber=" + contactNumber + ", address=" + address + ", city=" + city + ", country="
				+ country + ", pinCode=" + pinCode + ", gender=" + gender + ", gaurdianFistName=" + guardianFirstName
				+ ", GaurdianLastName=" + guardianLastName + "]";
	}

}
