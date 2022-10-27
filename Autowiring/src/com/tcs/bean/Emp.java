package com.tcs.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Emp {
	@Autowired
 Address address;
	@Autowired
 Exp exp;
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Exp getExp() {
	return exp;
}
public void setExp(Exp exp) {
	this.exp = exp;
}
@Override
public String toString() {
	return "Emp [address=" + address + ", exp=" + exp + "]";
}
 
 
 
}
