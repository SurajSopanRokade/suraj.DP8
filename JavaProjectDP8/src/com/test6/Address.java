package com.test6;

public class Address {
	String addr,city,state;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(String addr, String city, String state) {
		super();
		this.addr = addr;
		this.city = city;
		this.state = state;
	}
	
	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [addr=" + addr + ", city=" + city + ", state=" + state + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
