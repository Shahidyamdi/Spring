package com.tcs.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Emp {
	@Value("111") 
	private int eid;
	
	@Value("shahid")
	private String ename;
	
	@Value("10000.45")
	private double esal;

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}

}
