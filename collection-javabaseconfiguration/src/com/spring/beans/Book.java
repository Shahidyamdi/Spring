package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
	int bid;
	String bname;
	String bauthor;
	
	// getter and setter for Book
	public int getBid() {
		return bid;
	}
	@Autowired
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	
	@Autowired
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBauthor() {
		return bauthor;
	}
	@Autowired
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
		


}
