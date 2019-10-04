package com.csse_we_32.public_transport_ticketing_system.domain;

import java.util.Date;

public class CheckUp {
	private String travelId;
	private String checkUptHalt;
	private Date checkUpTime;
	//private String inspectorId;//user id
	public CheckUp(String travelId, String checkUptHalt, Date checkUpTime) {
		super();
		this.travelId = travelId;
		this.checkUptHalt = checkUptHalt;
		this.checkUpTime = checkUpTime;
	}
	public String getTravelId() {
		return travelId;
	}
	public void setTravelId(String travelId) {
		this.travelId = travelId;
	}
	public String getCheckUptHalt() {
		return checkUptHalt;
	}
	public void setCheckUptHalt(String checkUptHalt) {
		this.checkUptHalt = checkUptHalt;
	}
	public Date getCheckUpTime() {
		return checkUpTime;
	}
	public void setCheckUpTime(Date checkUpTime) {
		this.checkUpTime = checkUpTime;
	}
	
	
}
