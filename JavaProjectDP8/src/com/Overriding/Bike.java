package com.Overriding;
//5)WAP to create class Bike with fields color ,speed and  method bikeInfo()
//which is show color and speed of bike .
//create class Pulsar which extends Bike implement bikeInfo() differently child 
public class Bike {
	String colour;
	int speed;
	Bike (){
		colour="";
		speed=0;
	}
	public void bikeInfo(String colour, int speed) {
		this.colour=colour;
		this.speed=speed;
	}
	public String toString() {
		return " Colour "+colour+"\n"+" Speed " + speed;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1 = new Bike();
		b1.bikeInfo("Black", 23);
		System.out.println(b1);
	}

}
