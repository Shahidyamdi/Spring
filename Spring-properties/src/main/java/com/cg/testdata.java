package com.cg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("test")
public class testdata {
	@Value("${fee}")
	int fee;
	@Value("${name}")
	String name;
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "testdata [fee=" + fee + ", name=" + name + "]";
	}
	
	
}

