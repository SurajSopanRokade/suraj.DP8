package com.InheritanceAssignment;

public class ElectronicDevices {
	int serialid;
	String name;
	MyDate date;
	String os;
	double price;
	
	ElectronicDevices(){
		System.out.println("I am in default constructor of Electronic devices");
	}
	ElectronicDevices(int serialid, String name, MyDate d, String os, double price){
		
		this.serialid=serialid;
		this.name=name;
		date=d;
		this.os=os;
		this.price=price;
		
	}
	
	public int getSerialid() {
		return serialid;
	}
	public void setSerialid(int serialid) {
		this.serialid = serialid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MyDate getDate() {
		return date;
	}
	public void setDate(MyDate date) {
		this.date = date;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
		return " Serial id "+ serialid +"\n"+ " customer Name " + name +"\n"+ " Date of purchase " + date +"\n"+ " Operating system " + os +"\n"+ " Price " + price;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectronicDevices  e1 = new ElectronicDevices ();
		System.out.println(e1);
		
		ElectronicDevices  e2 = new ElectronicDevices (1, "Suraj", new MyDate(12,3,2022), "Windows", 23000);
		System.out.println(e2);
	}

}
