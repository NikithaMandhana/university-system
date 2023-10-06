package com.university.student.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.university.department.model.DepartmentVO;

import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

@Jacksonized @Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentVO {
	
	Integer studentId;
	
	String studentName;
	
	Integer enrollmentYear;
	
	DepartmentVO department;
	
	public StudentVO() {}
	
	public StudentVO(Integer studentId, String studentName, Integer enrollmentYear, DepartmentVO department) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.enrollmentYear = enrollmentYear;
		this.department = department;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getEnrollmentYear() {
		return enrollmentYear;
	}

	public void setEnrollmentYear(Integer enrollmentYear) {
		this.enrollmentYear = enrollmentYear;
	}

	public DepartmentVO getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentVO department) {
		this.department = department;
	}

}
