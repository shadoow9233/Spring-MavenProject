package com.springcore.auto.wired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("tmp2")

	private Address address;

	public Address getAddress() {
		return address;
	}
	
	//auto wired used by setter value
	//@Autowired
	public void setAddress(Address address) {
		System.out.println("Setting value");
		this.address = address;
		
	}
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	//auto wired used by constructor annotations
	//@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside constructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}



//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}

	
	
	
	
}
