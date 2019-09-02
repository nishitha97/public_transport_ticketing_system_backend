package com.csse_we_32.public_transport_ticketing_system.domain;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "buses")
public class Bus {
	private String regNumber;
	private String userId;
	private List<Integer> seatArrangement;
	private int seats;
	public Bus(String regNumber, String userId, List<Integer> seatArrangement, int seats) {
		super();
		this.regNumber = regNumber;
		this.userId = userId;
		this.seatArrangement = seatArrangement;
		this.seats = seats;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<Integer> getSeatArrangement() {
		return seatArrangement;
	}
	public void setSeatArrangement(List<Integer> seatArrangement) {
		this.seatArrangement = seatArrangement;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	
	
	
	
}
