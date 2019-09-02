package com.csse_we_32.public_transport_ticketing_system.domain;

import java.util.Date;

public class Seat {
	private String seatNo;
	private String smartCardId;
	private String from;
	private String to;
	private Date bookedTime;
	private Boolean purchased;
	
	
	public Seat(String seatNo, String smartCardId, String from, String to, Date bookedTime, Boolean purchased) {
		super();
		this.seatNo = seatNo;
		this.smartCardId = smartCardId;
		this.from = from;
		this.to = to;
		this.bookedTime = bookedTime;
		this.purchased = purchased;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public String getSmartCardId() {
		return smartCardId;
	}
	public void setSmartCardId(String smartCardId) {
		this.smartCardId = smartCardId;
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

	public Date getBookedTime() {
		return bookedTime;
	}

	public void setBookedTime(Date bookedTime) {
		this.bookedTime = bookedTime;
	}
	public Boolean getPurchased() {
		return purchased;
	}
	public void setPurchased(Boolean purchased) {
		this.purchased = purchased;
	}
	
	

}
