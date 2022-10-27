package com.cg;

public class Emp {
	private int eid;
	private String ename;
	private double esal;
	private Address address;
	public Emp(int eid, String ename, double esal,Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.address=address;
	
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", address=" + address.dno+ " " +address.street+"]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
