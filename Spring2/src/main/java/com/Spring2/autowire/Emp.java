package com.Spring2.autowire;

public class Emp {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setting Values :");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor :");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
	
}
