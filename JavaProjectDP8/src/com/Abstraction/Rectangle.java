package com.Abstraction;

public class Rectangle extends Shape{
	int l;
	int b;
	Rectangle(){
		l=0;
		b=0;
	}
	Rectangle(int l, int b){
		this.l=l;
		this.b=b;
	}
	public double calculateArea() {
		return l*b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(12,14);
		System.out.println(r1.calculateArea());
	}

}
