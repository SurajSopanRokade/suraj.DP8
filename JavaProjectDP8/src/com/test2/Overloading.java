package com.test2;
//4.  Design a class to overload a function volume() as follows:  [2]
//i) double volume(double r) – with radius ‘r’ as an argument, returns the volume of sphere using the formula:
//v = 4 / 3 × 22 / 7 × r3
//ii)double volume(double h, double r) – with height ‘h’ and radius ‘r’ as the arguments, returns the volume of a cylinder using the formula:
//v = 22 / 7 × r2 × h
//iii) double volume(double l, double b, double h) – with length ‘l’, breadth ‘b’ and height ‘h’ as the arguments, returns the volume of a cuboid using the formula:
//v = l × b × h


public class Overloading {
	public double volume(double r) {
		double v=4/3*22/7*(r*r*r);
		return v;
	}
	public double volume(double h, double r) {
		double v=22/7*(r*r)*h;
		return v;
	}
	public double volume(double l, double b, double h) {
		double v= l*b*h;
		return v;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o1 = new Overloading();
		System.out.println(o1.volume(2));
		System.out.println(o1.volume(2,4));
		System.out.println(o1.volume(2,4,5));
	}

}
