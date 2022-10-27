package com.tcs.beans;

public class Bently {
	String name;
	String typeofcar;
	String model;
	double price;

	public Bently() {
		System.out.println("0-arg bently constructor");
	}

	public Bently(String name, String typeofcar, String model, double price) {
		super();
		this.name = name;
		this.typeofcar = typeofcar;
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bently [name=" + name + ", typeofcar=" + typeofcar + ", model=" + model + ", price=" + price + "]";
	}

}
