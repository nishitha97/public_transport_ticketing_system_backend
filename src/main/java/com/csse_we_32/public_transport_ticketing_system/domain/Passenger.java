package com.csse_we_32.public_transport_ticketing_system.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Passenger {
	
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String Address;
	public Passenger(String firstName, String lastName, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
	
	
	
	
	
	
	
}
