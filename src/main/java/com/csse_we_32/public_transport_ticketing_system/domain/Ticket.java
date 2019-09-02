package com.csse_we_32.public_transport_ticketing_system.domain;

import java.util.Date;

public class Ticket {
	private String from;
	private String to;
	private String root;
	private double price;
	private Date bookedTime;
	private Boolean purchased;
	private String travelId;
	private String seatNumber;
	public Ticket(String from, String to, String root, double price, Date bookedTime, Boolean purchased) {
		super();
		this.from = from;
		this.to = to;
		this.root = root;
		this.price = price;
		this.bookedTime = bookedTime;
		this.purchased = purchased;
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
	public String getRoot() {
		return root;
	}
	public void setRoot(String root) {
		this.root = root;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
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
