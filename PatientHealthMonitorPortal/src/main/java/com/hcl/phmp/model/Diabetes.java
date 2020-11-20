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
@Table(name = "Diabetes")
public class Diabetes {
	@Id
	@Column(name = "PatientId")
	private String patientId;
	@Column
	private float bmi;
	@Column
	private float bPSystolicValue;
	@Column
	private float bPDiastolicValue;
	@Column
	private float fastingGlucose;
	@Column
	private float hDLCholesterol;
	@Column
	private float serumTriglycerides;
	@Column
	private float riskofDiabetes;

	
	public Diabetes() {
		//default constructor.
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
	 * @return the bPSystolicValue
	 */
	public float getbPSystolicValue() {
		return bPSystolicValue;
	}

	/**
	 * @param bPSystolicValue the bPSystolicValue to set
	 */
	public void setbPSystolicValue(float bPSystolicValue) {
		this.bPSystolicValue = bPSystolicValue;
	}

	/**
	 * @return the bPDiastolicValue
	 */
	public float getbPDiastolicValue() {
		return bPDiastolicValue;
	}

	/**
	 * @param bPDiastolicValue the bPDiastolicValue to set
	 */
	public void setbPDiastolicValue(float bPDiastolicValue) {
		this.bPDiastolicValue = bPDiastolicValue;
	}

	/**
	 * @return the fastingGlucose
	 */
	public float getFastingGlucose() {
		return fastingGlucose;
	}

	/**
	 * @param fastingGlucose the fastingGlucose to set
	 */
	public void setFastingGlucose(float fastingGlucose) {
		this.fastingGlucose = fastingGlucose;
	}

	/**
	 * @return the hDLCholesterol
	 */
	public float gethDLCholesterol() {
		return hDLCholesterol;
	}

	/**
	 * @param hDLCholesterol the hDLCholesterol to set
	 */
	public void sethDLCholesterol(float hDLCholesterol) {
		this.hDLCholesterol = hDLCholesterol;
	}

	/**
	 * @return the serumTriglycerides
	 */
	public float getSerumTriglycerides() {
		return serumTriglycerides;
	}

	/**
	 * @param serumTriglycerides the serumTriglycerides to set
	 */
	public void setSerumTriglycerides(float serumTriglycerides) {
		this.serumTriglycerides = serumTriglycerides;
	}

	/**
	 * @return the riskofDiabetes
	 */
	public float getRiskofDiabetes() {
		return riskofDiabetes;
	}

	/**
	 * @param riskofDiabetes the riskofDiabetes to set
	 */
	public void setRiskofDiabetes(float riskofDiabetes) {
		this.riskofDiabetes = riskofDiabetes;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Diabetes [patientId=" + patientId + ", bmi=" + bmi + ", bPSystolicValue=" + bPSystolicValue
				+ ", bPDiastolicValue=" + bPDiastolicValue + ", fastingGlucose=" + fastingGlucose + ", hDLCholesterol="
				+ hDLCholesterol + ", serumTriglycerides=" + serumTriglycerides + ", riskofDiabetes=" + riskofDiabetes
				+ "]";
	}
 
}
