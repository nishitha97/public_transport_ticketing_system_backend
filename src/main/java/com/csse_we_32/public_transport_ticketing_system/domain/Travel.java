package com.csse_we_32.public_transport_ticketing_system.domain;

import java.util.Date;
import java.util.List;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "travels")
public class Travel {
	@Id
	private String id;
	private List<Seat> seats;
	private String from;
	private String to;
	private Date leaveTime;
	private Date arrivalTime;
	private UserType userType;
	private String currentHalt;
	private Bus bus;
	private String root;
	private List<String> haltList;
	public Travel(List<Seat> seats, String from, String to, Date leaveTime, Date arrivalTime, UserType userType,
			String currentHalt, Bus bus, String root, List<String> haltList) {
		super();
		this.seats = seats;
		this.from = from;
		this.to = to;
		this.leaveTime = leaveTime;
		this.arrivalTime = arrivalTime;
		this.userType = userType;
		this.currentHalt = currentHalt;
		this.bus = bus;
		this.root = root;
		this.haltList = haltList;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Seat> getSeats() {
		return seats;
	}
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Date getLeaveTime() {
		return leaveTime;
	}
	public void setLeaveTime(Date leaveTime) {
		this.leaveTime = leaveTime;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public String getCurrentHalt() {
		return currentHalt;
	}
	public void setCurrentHalt(String currentHalt) {
		this.currentHalt = currentHalt;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public String getRoot() {
		return root;
	}
	public void setRoot(String root) {
		this.root = root;
	}
	public List<String> getHaltList() {
		return haltList;
	}
	public void setHaltList(List<String> haltList) {
		this.haltList = haltList;
	}
	
	
	
	
	
	
	
	
	

}
