package com.capg.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentInfo {

	@Id
	private String studentName;
	private int studentId;
	private LocalDate dob;
	
	public StudentInfo() {
		super();
	}

	public StudentInfo(String studentName, int studentId, LocalDate dob) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.dob = dob;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	
}
