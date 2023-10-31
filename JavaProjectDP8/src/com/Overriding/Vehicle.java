package com.Overriding;
//3)WAP to create class Vehicle with methods accelerate(long mph)
//with long type parameter ,stop(),run() all method return string type of value. 
//Create class car which extends Vehicle implement accelerate(long mph)differently in car class.
public class Vehicle {
	long mph;
	public void accelerate(long mph) {
		this.mph=mph;
		//System.out.println("Mph of class Vehicle" + mph);
	}
	public String Stop() {
		return "Vehicle Stop()";
	}
	public String Run() {
		return "Vehicle Run()";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
