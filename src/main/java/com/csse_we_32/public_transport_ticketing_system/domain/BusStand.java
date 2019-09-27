package com.csse_we_32.public_transport_ticketing_system.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bus_stands")
public class BusStand {
	@Id
	private String id;
	private String name;
	private String address;
	private List<TimeSlot> timeSlots;
	public BusStand( String name, String address, List<TimeSlot> timeSlots) {
		super();

		this.name = name;
		this.address = address;
		this.timeSlots = timeSlots;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<TimeSlot> getTimeSlots() {
		return timeSlots;
	}
	public void setTimeSlots(List<TimeSlot> timeSlots) {
		this.timeSlots = timeSlots;
	}
	
	
	
	
	

}
