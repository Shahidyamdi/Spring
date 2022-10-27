package com.tcs.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("pro")
public class Product {
	private int id;
	private String name;
	private double price;

	public Product(@Value("5763") int id, @Value("bottle") String name, @Value("107.45") double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
