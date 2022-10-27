package com.cg.springorm.product.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cg.springorm.product.Product;
import com.cg.springorm.product.dao.ProductDao;
@Component("productsimp")
public class ProductDaoImpl implements ProductDao{
	@Autowired
	HibernateTemplate hibernatetemplate;
	
	@Transactional
    public int create(Product product) {
    	Integer result = (Integer) hibernatetemplate.save(product);
		return result;
	}
     @Transactional
	public void update(Product product) {
		hibernatetemplate.update(product);
		
	}
     @Transactional
	public void delete(Product product) {
		hibernatetemplate.delete( product);
		
	}
     @Transactional
	public Product find(int id) {
		Product product = hibernatetemplate.get(Product.class, id);
		return product;
	}
	public List<Product> findall() {
		List<Product> products = hibernatetemplate.loadAll(Product.class);
		return  products;
	}

}
