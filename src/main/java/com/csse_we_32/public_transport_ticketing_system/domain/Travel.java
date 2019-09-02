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
	private String busStand;
	private String to;
	private Date leaveTime;
	private Date arrivalTime;	
	private String currentHalt;
	private Bus bus;
	private String root;
	private List<String> haltList;
	public Travel(List<Seat> seats, String busStand, String to, Date leaveTime, Date arrivalTime, String currentHalt, Bus bus, String root, List<String> haltList) {
		super();
		this.seats = seats;
		this.busStand = busStand;
		this.to = to;
		this.leaveTime = leaveTime;
		this.arrivalTime = arrivalTime;
	
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
	public String getBusStand() {
		return busStand;
	}
	public void setBusStand(String busStand) {
		this.busStand = busStand;
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
