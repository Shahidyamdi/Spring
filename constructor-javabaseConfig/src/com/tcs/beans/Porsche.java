package com.tcs.beans;

public class Porsche {
	String name;
	String typeofcar;
	String model;
	double price;

	public Porsche(String name, String typeofcar, String model, double price) {
		super();
		this.name = name;
		this.typeofcar = typeofcar;
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Porsche [name=" + name + ", typeofcar=" + typeofcar + ", model=" + model + ", price=" + price + "]";
	}

}
