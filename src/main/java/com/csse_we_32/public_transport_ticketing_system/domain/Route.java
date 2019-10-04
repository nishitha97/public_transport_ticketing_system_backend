package com.csse_we_32.public_transport_ticketing_system.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "routes")
public class Route {
	@Id
	private String id;
	//private String RouteType;
	//to
	//from
	private List<Halt> haltArray;
	private double costPerKm;
	public Route(String id, List<Halt> haltArray,double costPerKm) {
		super();
		this.id = id;
		this.haltArray = haltArray;
		this.costPerKm=costPerKm;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Halt> getHaltArray() {
		return haltArray;
	}
	public void setHaltArray(List<Halt> haltArray) {
		this.haltArray = haltArray;
	}

	public double getCostPerKm() {
		return costPerKm;
	}

	public void setCostPerKm(double costPerKm) {
		this.costPerKm = costPerKm;
	}
}
