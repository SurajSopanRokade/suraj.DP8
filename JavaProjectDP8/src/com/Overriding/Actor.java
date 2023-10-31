package com.Overriding;
//8)WAP to create class Person with method readScript().
//create class Actor which extends Person implement readScript() differently in child.

public class Actor extends Person {
	public void readScript() {
		System.out.println("I am in readScript of class Actor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actor a1 = new Actor();
		a1.readScript();
	}

}
