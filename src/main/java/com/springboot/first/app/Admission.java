package com.springboot.first.app;

public class Admission {

	public Department department;
	public Doctor doctor;
	public Patient patient;
	
	
	 
	
	public Admission(Department department, Doctor doctor, Patient patient) {
		super();
		this.department = department;
		this.doctor = doctor;
		this.patient = patient;
	}

		
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
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