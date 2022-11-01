package com.springboot.first.app;

public class Doctor {
	
	private String name;
	private Integer doctorID;

	public Department department;
	

	 
	
	public Doctor(String name, Integer doctorID, Department department) {
		super();
		this.name = name;
		this.doctorID = doctorID;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(Integer doctorID) {
		this.doctorID = doctorID;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

}
