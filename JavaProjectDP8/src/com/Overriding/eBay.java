package com.Overriding;
//2) WAP to create class company with method address. 
//create class eBay which extends company implement address() differently in eBay class.
//Here the method address ()has been overridden in child class.
public class eBay extends Company {
	public void address() {
		System.out.println("I am in address() in eBay class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eBay e1 = new eBay();
		e1.address();
	}

}
