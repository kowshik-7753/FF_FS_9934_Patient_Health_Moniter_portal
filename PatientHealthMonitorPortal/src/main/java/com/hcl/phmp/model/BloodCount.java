package com.hcl.phmp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author kowshik.kotha
 *
 */
@Entity
@Table(name = "Blood_Count")
public class BloodCount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	@Column(name = "patientId")
	private String patientId;
	@Column
	private int rbc;
	@Column
	private int wbc;
	@Column
	private int platelet;
	
	public BloodCount() {
		//default constructor.
	}

	/**
	 * @return the patientId
	 */
	public String getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId
	 *            the patientId to set
	 */
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	/**
	 * @return the rbc
	 */
	public int getRbc() {
		return rbc;
	}

	/**
	 * @param rbc
	 *            the rbc to set
	 */
	public void setRbc(int rbc) {
		this.rbc = rbc;
	}

	/**
	 * @return the wbc
	 */
	public int getWbc() {
		return wbc;
	}

	/**
	 * @param wbc
	 *            the wbc to set
	 */
	public void setWbc(int wbc) {
		this.wbc = wbc;
	}

	/**
	 * @return the platelet
	 */
	public int getPlatelet() {
		return platelet;
	}

	/**
	 * @param platelet
	 *            the platelet to set
	 */
	public void setPlatelet(int platelet) {
		this.platelet = platelet;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BloodCount [PatientId=" + patientId + ", rbc=" + rbc + ", wbc=" + wbc + ", platelet=" + platelet + "]";
	}

}
