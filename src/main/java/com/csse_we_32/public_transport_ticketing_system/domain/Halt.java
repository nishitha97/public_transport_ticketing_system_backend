package com.csse_we_32.public_transport_ticketing_system.domain;

public class Halt {
	private String name;
	private double kmFromBustand1;
	//kmFromBustand1
	
	
	public String getName() {
		return name;
	}
	public Halt(String name, double kmFromBustand1) {
		super();
		this.name = name;
		this.kmFromBustand1 = kmFromBustand1;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getKmFromBustand1() {
		return kmFromBustand1;
	}
	public void setKmFromBustand1(double kmFromBustand1) {
		this.kmFromBustand1 = kmFromBustand1;
	}
	
	
}
