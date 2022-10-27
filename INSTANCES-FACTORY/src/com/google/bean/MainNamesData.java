package com.google.bean;

public class MainNamesData {
	NamesData namesData;

	public void setNamesData(NamesData namesData) {
		this.namesData = namesData;
	}
	
	
	public void displayNames()
	{	String[] names = namesData.getNames();
		System.out.println("The names are...");
		for(String name : names)
		{	System.out.println(name);
		}
	}
	

}
