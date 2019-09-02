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
	
	
	

}
