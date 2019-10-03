package com.csse_we_32.public_transport_ticketing_system.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TimeSlot {
	@Id
	private String id;
	private String from;//busStand Name
	//private String address;
	private String day;
	private String leaveTime;
	private String arrivalTime;
	private String  routeId;
	private String to;
	private String travelId;
	private String  busRegNumber;
	private double price;

	public TimeSlot(String from, String day, String leaveTime, String arrivalTime, String routeId, String to, String travelId, String busRegNumber, double price ) {
		this.from = from;

		this.day = day;
		this.leaveTime = leaveTime;
		this.arrivalTime = arrivalTime;
		this.routeId = routeId;
		this.to = to;
		this.travelId = travelId;
		this.busRegNumber = busRegNumber;
		this.price=price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}



	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public void setLeaveTime(String leaveTime) {
		this.leaveTime = leaveTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
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

	public String getBusRegNumber() {
		return busRegNumber;
	}

	public void setBusRegNumber(String busRegNumber) {
		this.busRegNumber = busRegNumber;
	}

	public String getLeaveTime() {
		return leaveTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
