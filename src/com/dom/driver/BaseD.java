package com.dom.driver;

public class BaseD {
	
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String phone;
	
	public BaseD(int id, String firstName,String lastName, String phone){
		this.firstName = firstName;
		this.id = id;
		this.lastName = lastName;
		this.phone = phone;
	}
	
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

}
