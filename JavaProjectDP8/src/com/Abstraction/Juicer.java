package com.Abstraction;
//1. Create an abstract class Machine with an implemented / concrete method 
//rotate and an abstract method crush. Create a class Juicer which extends this 
//abstract class Machine and implements method crush. Now, add another 
//method filter in the class Juicer. In main method, 
//a. Create an object of type Juicer and calls its crush, rotate and filter 
//methods. 
//b. Create an object of type Juicer with reference variable of Machine 
//(Machine m = new Juicer). Check the methods available to m
public class Juicer extends Machine {
	@Override
	public void crush() {
		System.out.println("I am in crush() of juicer");
	
	}
	public void filter() {
		System.out.println("I am in filter () of juicer");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juicer j1 = new Juicer();
		j1.crush();
		j1.rotate();
		j1.filter();
		Machine m = new Juicer();
		m.crush();
		m.rotate();
		((Juicer) m).filter();
	}

	

}
