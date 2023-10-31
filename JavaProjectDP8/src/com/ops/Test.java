package com.ops;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountStatic obj = new AccountStatic(1233, 2, 2000, "Suraj");
		obj.interest(5);
		obj.calculateInterest();
		obj.display();
	}
}