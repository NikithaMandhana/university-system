package com.university.faculty.model;

import com.university.department.model.DepartmentVO;

public class FacultyVO {
	
	Integer facultyId;
	
	String facultyName;
	
	String designation;
	
	DepartmentVO department;

	public FacultyVO() {}

	public FacultyVO(Integer facultyId, String facultyName, String designation, DepartmentVO department) {
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

	public DepartmentVO getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentVO department) {
		this.department = department;
	}

}
