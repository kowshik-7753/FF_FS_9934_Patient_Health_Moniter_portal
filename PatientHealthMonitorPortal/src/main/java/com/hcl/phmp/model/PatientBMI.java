/**
 * 
 */
package com.hcl.phmp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author kowshik.kotha
 *
 */
@Entity
@Table(name="patientBMI")
public class PatientBMI {
	@Id
	@Column(name="patientId")
private String patientId;
private float height;
private float weight;
private float bmi;
private String currentDate;
	public PatientBMI() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the patientId
	 */
	public String getPatientId() {
		return patientId;
	}
	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
	}
	/**
	 * @return the weight
	 */
	public float getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}
	/**
	 * @return the bmi
	 */
	public float getBmi() {
		return bmi;
	}
	/**
	 * @param bmi the bmi to set
	 */
	public void setBmi(float bmi) {
		this.bmi = bmi;
	}
	/**
	 * @return the currentDate
	 */
	public String getCurrentDate() {
		return currentDate;
	}
	/**
	 * @param currentDate the currentDate to set
	 */
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PatientBMI [patientId=" + patientId + ", height=" + height + ", weight=" + weight + ", bmi=" + bmi
				+ ", currentDate=" + currentDate + "]";
	}

}
