package com.InheritanceAssignment;

public class Tv extends ElectronicDevices {
	String manufact, size;
	
	Tv(){
		manufact="";
		size="";
	}
	Tv(int serialid, String name, MyDate d, String os, double price, String manufact, String size){
		super(serialid, name,d, os,price);
		this.manufact=manufact;
		this.size=size;
	}
	public void setManufact(String manufact) {
		this.manufact=manufact;
	}
	public void setSize(String size) {
		this.size=size;
	}
	public String getManufact() {
		return manufact;
	}
	public String getSize() {
		return size;
	}
	
	public String toString() {
		return super.toString()+"\n"+ " Manufacturar " + manufact +"\n"+ " Size " + size;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv(1, "Suraj", new MyDate(12,3,2022), "Windows", 50000, "Samsung", "35cm");
		System.out.println(t1);
	}

}
