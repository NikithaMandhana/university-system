package com.university.student.model;

import com.university.department.model.Department;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer studentId;
	
	String studentName;
	
	Integer enrollmentYear;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "departmentId")
    private Department department;

	public Student() {
		super();
	}

	public Student(Integer studentId, String studentName, Integer enrollmentYear, Department department) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.enrollmentYear = enrollmentYear;
		this.department= department;
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
