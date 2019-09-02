package com.csse_we_32.public_transport_ticketing_system.domain;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "buses")
public class Bus {
	private String regNumber;
	private String userId;
	private List<Integer> seatArrangement;
	private int seats;
	private String route;
	private String busStand;
	
	public Bus(String regNumber, String userId, List<Integer> seatArrangement, int seats, String route,
			String busStand) {
		super();
		this.regNumber = regNumber;
		this.userId = userId;
		this.seatArrangement = seatArrangement;
		this.seats = seats;
		this.route = route;
		this.busStand = busStand;
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
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getBusStand() {
		return busStand;
	}
	public void setBusStand(String busStand) {
		this.busStand = busStand;
	}
	
	
	
	
	
}
