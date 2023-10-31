package com.Overriding;
//WAP to create class shape with method draw().
//create class circle, square, Rectangle which extends Shape implement draw() differently in each child.
public class Rectangle extends Shape {
	public void draw() {
		System.out.println("i am in draw() of child class rectangle");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
		r1.draw();
	}

}
