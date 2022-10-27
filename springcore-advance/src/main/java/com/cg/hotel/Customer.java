package com.cg.hotel;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	private int id;
	private String name;
	private Reservation reserved;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Reservation getReserved() {
		return reserved;
	}@Autowired
	public void setReserved(Reservation reserved) {
		this.reserved = reserved;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", reserved=" + reserved + "]";
	}
	
	
	

}
