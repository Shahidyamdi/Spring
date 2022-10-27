package com.tcs.collection.constructor;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teacher {
	private Set<Integer> id;
	private List<String> names;
	private Map<Integer, String> yearsofExp;
	private List<Address> address;
	public Teacher(Set<Integer> id, List<String> names, Map<Integer, String> yearsofExp, List<Address> address) {
		super();
		this.id = id;
		this.names = names;
		this.yearsofExp = yearsofExp;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", names=" + names + ", yearsofExp=" + yearsofExp + ", address=" + address + "]";
	}
	

}
