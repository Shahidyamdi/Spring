package com.tcs.springconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {
	@Autowired
	Dao dao;
	
	public void init() {
		System.out.println("init()");
	}
	public void destroy() {
		System.out.println("cleanup()");
	}
	
	
	public void save() {
		dao.create();
	}

}
