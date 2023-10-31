package com.WithoutMainMethod;

public class Factorial {
	public int Factorial1(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial obj = new Factorial();
		int res = obj.Factorial1(5);
		System.out.println(res);
	}

}
