package com.tcs.beans;

public class Tesla {

	String name;
	String typeOfcar;
	String model;
	double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeOfcar() {
		return typeOfcar;
	}

	public void setTypeOfcar(String typeOfcar) {
		this.typeOfcar = typeOfcar;
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
		return "Tesla [name=" + name + ", typeOfcar=" + typeOfcar + ", model=" + model + ", price=" + price + "]";
	}

}
