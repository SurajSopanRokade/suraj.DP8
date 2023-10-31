package com.Interface;

public class Rectangle implements Printable {
	double l;
	double b;
	Rectangle(){
		
	}
	Rectangle(double l, double b){
		this.l=l;
		this.b=b;
	}
	@Override
	public double show() {
		return l*b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable r1 = new Rectangle(12.0,34.0);
	}
	
	

}
