package com.cg.springorm.product.dao;

import java.util.List;

import com.cg.springorm.product.Product;

public interface ProductDao {
	int create(Product product);
	void update(Product product);
	void delete(Product product);
	Product find(int id);
	List<Product> findall();
	

}
