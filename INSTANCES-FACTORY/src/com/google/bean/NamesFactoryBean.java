package com.google.bean;

public class NamesFactoryBean {

	public NamesData getIndianNames() {
		return new IndianNames();
	}

	public NamesData getUsNames() {
		return new USNames();
	}
}
