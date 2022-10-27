package com.cg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("shahid")
public class testdata {
	@Value("sameer")
	String name;
	@Value("5000")
	int fee;
	
	
	public void wish() {
		System.out.println("hi good morning");
		System.out.println(name);
		System.out.println(fee);
	}

}
