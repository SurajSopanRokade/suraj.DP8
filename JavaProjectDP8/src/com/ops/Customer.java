package com.ops;

public class Customer {
	
    public static int count=0;
	String name;
    int total;
	Customer()
	{
		total=++count;
	}
	public void setData( String name)
	{
	   
	    this.name=name;
	}
	public void customerInfo()
	{
		
		System.out.println("Customer name is " + this.name);
		System.out.println("Customer count is " + this.total);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1 = new Customer();
		c1.setData( "Suraj");
		c1.customerInfo();
		
		Customer c2 = new Customer();
		c2.setData( "S");
		c2.customerInfo();
		
		Customer c3 = new Customer();
		c3.setData( "u");
		c3.customerInfo();
		
		System.out.println("Total count is = " + count);
				
	}

}
