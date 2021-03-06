package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Student extends Person {

	private eMajor eMajor;
	private UUID StudentID;
	
	public eMajor geteMajor ( )
    {
        return this.eMajor;
    }
    public void seteMajor (eMajor Major)
    {
        this.eMajor = Major;    
    }
    
    public UUID getStudentID(){
    	return this.StudentID;
    }
    
    
    
    
	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, eMajor eMajor,
			String Address, String Phone_number, String Email) throws PersonException
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.StudentID = UUID.randomUUID();
		this.eMajor = eMajor;
		
	}
	
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
}