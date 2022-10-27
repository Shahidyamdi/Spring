package com.cg.order;

public class Order {
		 
	    private String item;
	     
	    private int price;
	     
	    public String getItem() {
	        return item;
	    }
	    public void setItem(String item) {
	        this.item = item;
	    }
	   
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Order [item=" + item + ", price=" + price + "]";
		}
	    
	    
	}

