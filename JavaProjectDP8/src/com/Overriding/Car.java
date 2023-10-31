package com.Overriding;
//3)WAP to create class Vehicle with methods accelerate(long mph)
//with long type parameter ,stop(),run() all method return string type of value. 
//Create class car which extends Vehicle implement accelerate(long mph)differently in car class.
public class Car extends Vehicle{
	public void accelerate(long mph) {
		this.mph=mph;
		System.out.println("Mph of class car" + mph);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.accelerate(2345);
		System.out.println(c1.Stop());
		System.out.println(c1.Run());
	}

}
