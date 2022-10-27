package com.tcs.beans;

public class Tesla {

	String name;
	String typeOfcar;
	String model;
	double price;

	public Tesla() {
		System.out.println("tsela 0-arg constructor");
	}

	public Tesla(String name, String typeOfcar, String model, double price) {
		super();
		this.name = name;
		this.typeOfcar = typeOfcar;
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Tesla [name=" + name + ", typeOfcar=" + typeOfcar + ", model=" + model + ", price=" + price + "]";
	}

}
