package com.Overriding;
//5)WAP to create class Bike with fields color ,speed and  method bikeInfo()
//which is show color and speed of bike .
//create class Pulsar which extends Bike implement bikeInfo() differently child 
public class Pulsar extends Bike {
	public void bikeInfo(String colour, int speed) {
		this.colour=colour;
		this.speed=speed;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pulsar p1 = new Pulsar();
		p1.bikeInfo("Blue", 267);
		System.out.println(p1);
	}

}
