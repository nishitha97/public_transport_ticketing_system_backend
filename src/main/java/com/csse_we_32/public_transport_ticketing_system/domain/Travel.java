package com.csse_we_32.public_transport_ticketing_system.domain;

import java.util.Date;
import java.util.List;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "travels")
public class Travel {
	@Id
	private String id;
	//private List<Seat> seats;
	private String busStand;
	private String to;
	private Date date;
	private String timeSlotId;
	private String  leaveTime;
	private String  arrivalTime;
	private String currentHalt;
	private String regNumber;
	private String routeID;

	public Travel( String busStand, String to, Date date, String timeSlotId, String leaveTime, String arrivalTime, String currentHalt, String regNumber, String routeID) {

		this.busStand = busStand;
		this.to = to;
		this.date = date;
		this.timeSlotId = timeSlotId;
		this.leaveTime = leaveTime;
		this.arrivalTime = arrivalTime;
		this.currentHalt = currentHalt;
		this.regNumber = regNumber;
		this.routeID = routeID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTimeSlotId() {
		return timeSlotId;
	}

	public void setTimeSlotId(String timeSlotId) {
		this.timeSlotId = timeSlotId;
	}

	public String getLeaveTime() {
		return leaveTime;
	}

	public void setLeaveTime(String leaveTime) {
		this.leaveTime = leaveTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getCurrentHalt() {
		return currentHalt;
	}

	public void setCurrentHalt(String currentHalt) {
		this.currentHalt = currentHalt;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public String getRouteID() {
		return routeID;
	}

	public void setRouteID(String routeID) {
		this.routeID = routeID;
	}
}
