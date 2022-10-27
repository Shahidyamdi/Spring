package com.cg.bean;

public class InstanceFactoryBean {
	// instance factory method to return the demo object.
	public Demo getDemo() {
		return new Demo();
	}
}
