package com.cg.injection.interfaces;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOImpl2 implements OrderDAO {

	public void createOrder() {
		System.out.println("inside order DAO2 order created");
		
	}

}
