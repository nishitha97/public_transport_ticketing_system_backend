package com.csse_we_32.public_transport_ticketing_system.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "routes")
public class Route {
	@Id
	private String id;
	//private String RouteType;
	private List<String> haltArray;
	public Route(String id, List<String> haltArray) {
		super();
		this.id = id;
		this.haltArray = haltArray;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<String> getHaltArray() {
		return haltArray;
	}
	public void setHaltArray(List<String> haltArray) {
		this.haltArray = haltArray;
	}
	
	
	
}
