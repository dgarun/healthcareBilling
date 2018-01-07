package com.healthcare.dto;

import java.sql.Date;
import java.util.UUID;

public class PersonDto {

	private UUID id;
	private String firstName;
	private String lastName;
	private int age;
	private Date dob;
	
	public PersonDto(){
		
	}
	
	public PersonDto(UUID id,String firstName, String lastName, int age, Date dob){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dob = dob;
	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
}
