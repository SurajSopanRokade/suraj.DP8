package com.InheritanceAssignment;
//2. Create a class BigKid which extends Kid created above. Implement readBook() 
//differently in BigKid class. Here the method readBook() has been over-ridden in 
//the child class BigKid() 
public class KidB extends BigKid {
	public void readBook() {
		System.out.println("I am in kid B child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KidB k1 = new KidB();
		k1.readBook();
	}

}
