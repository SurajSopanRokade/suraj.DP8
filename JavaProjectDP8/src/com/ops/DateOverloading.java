package com.ops;

public class DateOverloading {
	int a, b;
	public void add(double i, double j)
	{
		System.out.println("Addition of double " + (i+j));
	}
	public void add(float f1, float f2)
	{
		System.out.println("Addition of float " + (f1+f2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateOverloading obj = new DateOverloading();
			obj.add(5, 6);
			obj.add(7, 8f );
	}

}
