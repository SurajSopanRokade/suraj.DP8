package com.Interface;

public class Circle implements Printable {
	double r;
	double pi=3.14;
	Circle(){
		
	}
	Circle(double r){
		this.r=r;
	}
	public double show() {
		
		return pi*r*r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable p1 = new Circle(3.5);
		System.out.println(p1.show());
	}

	
	

}
