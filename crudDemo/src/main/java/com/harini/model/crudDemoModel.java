package com.harini.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class crudDemoModel {
	
	@Id
	private int id;
	private String name;
	private String dob;
	private String phno;
	
	public String toString()

	{
		return "Name : "+name+"\n"+"Date Of Birth : "+dob+"\n"+"Phone Number : "+phno+"\n";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	
	

}
