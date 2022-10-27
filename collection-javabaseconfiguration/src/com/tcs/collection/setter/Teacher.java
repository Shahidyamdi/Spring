package com.tcs.collection.setter;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teacher {
	private Set<Integer> id;
	private List<String> names;
	private Map<Integer, String> yearsofExp;
	private List<Address> address;
	public Set<Integer> getId() {
		return id;
	}
	public void setId(Set<Integer> id) {
		this.id = id;
	}
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public Map<Integer, String> getYearsofExp() {
		return yearsofExp;
	}
	public void setYearsofExp(Map<Integer, String> yearsofExp) {
		this.yearsofExp = yearsofExp;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", names=" + names + ", yearsofExp=" + yearsofExp + ", address=" + address + "]";
	}
	

}
