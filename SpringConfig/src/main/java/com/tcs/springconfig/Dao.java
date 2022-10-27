package com.tcs.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Dao {
	public void create() {
		System.out.println("created");
	}
	
}
