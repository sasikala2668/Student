package com.example.demo.dto;

public class StudentDTO {
	private Long id;
	private String studentName;
	private String studentAge;
	private String studentEmail;
	private String studentMobileNo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentMobileNo() {
		return studentMobileNo;
	}

	public void setStudentMobileNo(String studentMobileNo) {
		this.studentMobileNo = studentMobileNo;
	}

}
