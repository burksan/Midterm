package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	public Enrollment() {}


	public Enrollment(UUID sectionID, UUID studentID) {
		super();
		SectionID = sectionID;
		StudentID = studentID;
	}

// SetGrade(double grade) should be defined as a procedure.
	
	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		this.Grade = grade;
	}


	public UUID getSectionID() {
		return SectionID;
	}


	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}


	public UUID getStudentID() {
		return StudentID;
	}


	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}


	public UUID getEnrollmentID() {
		return EnrollmentID;
	}


	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}
	
	
}
