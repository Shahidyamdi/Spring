package com.cg.order;

import org.springframework.beans.factory.annotation.Autowired;
	 
	public class PaymentGateway {
	 
	    @Autowired
	    private Order order;

		@Override
		public String toString() {
			return "PaymentGateway [order=" + order + "]";
		}
	     
	   
	}


