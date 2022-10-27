package com.cg.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springorm.product.Product;
import com.cg.springorm.product.dao.ProductDao;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cg/springorm/product/test/db.xml");
		ProductDao productDao =(ProductDao) context.getBean("productsimp");
		/*Product product = new Product();
		product.setId(3);
		product.setName("airpods");
		product.setDesc("fab");
		product.setPrice(2000);
		
		//productDao.create(product);
		 //productDao.update(product);
		//productDao.delete(product);*/
		
		
		
		//Product product = productDao.find(3);
		
		List<Product> products = productDao.findall();
		System.out.println(products);
	}

}
