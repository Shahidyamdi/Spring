package com.tcs.beans;

public class Car {

	String carDealer;

	Tesla tesla;

	Bently bently;

	Porsche porsche;

	public Car(String carDealer, Tesla tesla, Bently bently, Porsche porsche) {
		super();
		this.carDealer = carDealer;
		this.tesla = tesla;
		this.bently = bently;
		this.porsche = porsche;
	}

	public String getCarDealer() {
		return carDealer;
	}

	public void setCarDealer(String carDealer) {
		this.carDealer = carDealer;
	}

	public Tesla getTesla() {
		return tesla;
	}

	public void setTesla(Tesla tesla) {
		this.tesla = tesla;
	}

	public Bently getBently() {
		return bently;
	}

	public void setBently(Bently bently) {
		this.bently = bently;
	}

	public Porsche getPorsche() {
		return porsche;
	}

	public void setPorsche(Porsche porsche) {
		this.porsche = porsche;
	}

	@Override
	public String toString() {
		return "Car [carDealer=" + carDealer + ", tesla=" + tesla + "/n, bently=" + bently + "/n, porsche=" + porsche + "/n]";
	}

}
