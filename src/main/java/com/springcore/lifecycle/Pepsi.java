package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,  DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		// Initialization logic
        System.out.println("Taking Pepsi; initialization");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		// Cleanup logic
        System.out.println("Disposing of Pepsi; destroy");

		
	}
	

}
