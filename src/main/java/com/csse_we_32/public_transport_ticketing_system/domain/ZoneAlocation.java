package com.csse_we_32.public_transport_ticketing_system.domain;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ZoneAlocation {
	private String id;
	private String zone;
	private String inspectorId;//user id
	private List<CheckUp> CheckList;
	public ZoneAlocation(String id, String zone, String inspectorId, List<CheckUp> checkList) {
		super();
		this.id = id;
		this.zone = zone;
		this.inspectorId = inspectorId;
		CheckList = checkList;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getInspectorId() {
		return inspectorId;
	}
	public void setInspectorId(String inspectorId) {
		this.inspectorId = inspectorId;
	}
	public List<CheckUp> getCheckList() {
		return CheckList;
	}
	public void setCheckList(List<CheckUp> checkList) {
		CheckList = checkList;
	}
	
	
	
}
