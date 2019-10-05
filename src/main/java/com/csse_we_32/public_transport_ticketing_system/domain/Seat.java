package com.csse_we_32.public_transport_ticketing_system.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document(collection = "seats")
public class Seat {
	@Id
	private String id;
	private String travelId;
	private int seatNo;
	private String smartCardId;
	private String from;
	private String to;
	private Date bookedTime;
	private Boolean purchased;
    private double price;
    private int feedback;

	
	
	public Seat(String travelId,int seatNo, String smartCardId, String from, String to, Date bookedTime, Boolean purchased,double price) {
		super();
		this.travelId=travelId;
		this.seatNo = seatNo;
		this.smartCardId = smartCardId;
		this.from = from;
		this.to = to;
		this.bookedTime = bookedTime;
		this.purchased = purchased;
		this.price=price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTravelId() {
		return travelId;
	}

	public void setTravelId(String travelId) {
		this.travelId = travelId;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public int getFeedback() {
		return feedback;
	}

	public void setFeedback(int feedback) {
		this.feedback = feedback;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
