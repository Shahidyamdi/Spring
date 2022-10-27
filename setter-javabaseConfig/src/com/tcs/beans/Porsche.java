package com.tcs.beans;

public class Porsche {
	String name;
	String typeofcar;
	String model;
	double price;

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTypeofcar() {
		return typeofcar;
	}


	public void setTypeofcar(String typeofcar) {
		this.typeofcar = typeofcar;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Porsche [name=" + name + ", typeofcar=" + typeofcar + ", model=" + model + ", price=" + price + "]";
	}

}
