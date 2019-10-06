package com.csse_we_32.public_transport_ticketing_system.domain;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "smart_cards")
public class SmartCard {
	
	@Id
	private String id;
	private String userId;
	private List<Ticket> tickets;
	private double amount;
	private Date lastUpdatedDataTime;
	private String QRCode;


	public SmartCard(String userId, List<Ticket> tickets, double amount) {
		super();
		this.userId = userId;
		this.tickets = tickets;
		this.amount = amount;
		this.lastUpdatedDataTime=new Date();
	}

	public String getQRCode() {
		return QRCode;
	}

	public void setQRCode(String qRCode) {

		this.QRCode=qRCode;
//		this.QRCode = lastUpdatedDataTime.toString()+id;
//		String originalString=lastUpdatedDataTime.toString()+id+secretKey;;
//		MessageDigest digest = null;
//		byte[] encodedhash;
//		try {
//			digest = MessageDigest.getInstance("SHA-256");
//			encodedhash = digest.digest(
//					originalString.getBytes(StandardCharsets.UTF_8));
//		} catch (NoSuchAlgorithmException e) {
//			encodedhash="0".getBytes();
//			e.printStackTrace();
//		}
//
//		this.QRCode=encodedhash.toString();
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<Ticket> getTickets() {
		return tickets;
	}
	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getLastUpdatedDataTime() { return lastUpdatedDataTime; }
	public void setLastUpdatedDataTime(Date lastUpdatedDataTime) { this.lastUpdatedDataTime = lastUpdatedDataTime; }
}
