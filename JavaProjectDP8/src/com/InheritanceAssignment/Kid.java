package com.InheritanceAssignment;
//1. WAJP2 create a class Kid with method readBook() and another method 
//readBook () with 2 parameters. The method readBook here is over-loaded (same 
//method name but different parameters) 
public class Kid {
	public void readbook(int a, int b) {
		System.out.println(" i am in int int method");
	}
	public void readbook(double a, double b) {
		System.out.println(" i am in double double method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kid k1 = new Kid();
		k1.readbook(2.0,3.0);
	}

}
