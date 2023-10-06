package com.university.faculty.model;

import com.university.department.model.Department;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Faculty {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer facultyId;
	
	String facultyName;
	
	String designation;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "departmentId")
    private Department department;
	
	public Faculty() {
		super();
	}

	public Faculty(Integer facultyId, String facultyName, String designation, Department department) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.designation = designation;
		this.department = department;
	}

	public Integer getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
