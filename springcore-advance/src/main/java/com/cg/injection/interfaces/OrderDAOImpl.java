package com.cg.injection.interfaces;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOImpl implements OrderDAO {

	public void createOrder() {
		System.out.println("inside order DAO order created");
		
	}

}
