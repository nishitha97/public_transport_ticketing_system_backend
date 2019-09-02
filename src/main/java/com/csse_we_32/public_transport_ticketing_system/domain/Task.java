package com.csse_we_32.public_transport_ticketing_system.domain;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tasks")
public class Task {
	@Id
	private String id;
	private Date date;
	private String zone;
	private  List<String> inspectorIds;//user id
	private List<CheckUp> CheckList;
	
	
	
	public Task(Date date, String zone, List<String> inspectorIds, List<CheckUp> checkList) {
		super();
		this.date = date;
		this.zone = zone;
		this.inspectorIds = inspectorIds;
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

	public List<CheckUp> getCheckList() {
		return CheckList;
	}
	public void setCheckList(List<CheckUp> checkList) {
		CheckList = checkList;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<String> getInspectorIds() {
		return inspectorIds;
	}
	public void setInspectorIds(List<String> inspectorIds) {
		this.inspectorIds = inspectorIds;
	}
	
	
	
}
