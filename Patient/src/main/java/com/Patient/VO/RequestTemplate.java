package com.Patient.VO;

import org.springframework.beans.factory.annotation.Autowired;

import com.Patient.Entity.Patient;

public class RequestTemplate {
	
	@Autowired
	private Doctor doctor;
	private Patient patient;
	public RequestTemplate() {
		super();
	}
	public RequestTemplate(Doctor doctor, Patient patient) {
		super();
		this.doctor = doctor;
		this.patient = patient;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
}
