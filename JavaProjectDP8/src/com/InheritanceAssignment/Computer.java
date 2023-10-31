package com.InheritanceAssignment;

public class Computer extends ElectronicDevices {
	 
	String ram, systemtype, manufacturer;
	
	
	Computer(){
		System.out.println("I am in default const of computer");
	}
	Computer(int serialid, String name, MyDate d, String os, double price, String ram, String systemtype, String manufacturer){
		super(serialid,name,d, os, price);
		this.ram=ram;
		this.systemtype=systemtype;
		this.manufacturer=manufacturer;
	}
	public void setRam(String ram) {
		this.ram=ram;
	}
	public void setSystemtype(String systemtype ) {
		this.systemtype=systemtype;
	}
	public void setManufacturer(String manufacturer ) {
		this.manufacturer=manufacturer;
	}
	public String getRam() {
		return ram;
	}
	public String getSystemtype() {
		return systemtype;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String toString() {
		return super.toString()+"\n"+ " Ram " + ram +"\n"+ " Systemtype " + systemtype +"\n"+ " Manufacturer " + manufacturer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c1 = new Computer(1, "Suraj",new MyDate(12,3,2022),"Windows", 45000,"8gb","64 bits","DELL"  );
		System.out.println(c1);
		
	}

}
