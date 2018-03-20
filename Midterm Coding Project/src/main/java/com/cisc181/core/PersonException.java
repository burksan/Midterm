package com.cisc181.core;
import com.cisc181.core.Person;

public class PersonException extends Exception{

	private Person P;
	
	public PersonException(Person P) {
		super();
		this.P = P;}
	
	protected Person getDate() {
		return P;
	}
	
}
