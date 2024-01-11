package com.Test4;

public class Factorial {
	public void fact(int n) {
		int fact=1;
		for (int i=1; i<=n; i++) {
			fact=fact*i;
		}
		System.out.println("Fact = " + fact);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f1 = new Factorial();
		f1.fact(5);
	}

}
