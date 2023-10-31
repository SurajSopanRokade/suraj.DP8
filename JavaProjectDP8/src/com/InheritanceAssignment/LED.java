package com.InheritanceAssignment;

public class LED extends Tv{
	String colour;
	double price;
	LED(){
		colour="";
		price=0;
	}
	LED(int serialid, String name, MyDate d, String os, double price, String manufact, String size, String colour){
		super(serialid,name, d,os,price, manufact, size);
		this.colour=colour;
	}
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
		return super.toString() +"\n"+ " Colour " + colour;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LED l1 = new LED(123, "Suraj", new MyDate(12,3,2023), "Windows", 78000, "Samsung", "90cm","Black" );
		System.out.println(l1);
	}

}
