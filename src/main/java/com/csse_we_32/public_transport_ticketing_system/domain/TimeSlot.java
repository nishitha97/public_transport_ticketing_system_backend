package com.csse_we_32.public_transport_ticketing_system.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class TimeSlot {
	
	private String day;
	private Date leaveTime;
	private Date arrivalTime;
	private Route route;
	private String to;
	private String travelId;
	private Bus bus;
	public TimeSlot(String day, Date leaveTime, Date arrivalTime, Route route, String to, String travelId, Bus bus) {
		super();
		this.day = day;
		this.leaveTime = leaveTime;
		this.arrivalTime = arrivalTime;
		this.route = route;
		this.to = to;
		this.travelId = travelId;
		this.bus = bus;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
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
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getTravelId() {
		return travelId;
	}
	public void setTravelId(String travelId) {
		this.travelId = travelId;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	
	
	
	
	
	
	

}
