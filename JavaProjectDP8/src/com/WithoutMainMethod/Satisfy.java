package com.WithoutMainMethod;

public class Satisfy {
	public void Condition(int a) {
		int revnum = 0;
		int original = a;
		// dint res=594;
		while (a > 0) {
			int rem = a % 10;
			a = a / 10;
			revnum = revnum * 10 + rem;
		}
		original = original - revnum;
		if (original > 0) {
			System.out.println(original);
		} else
			System.out.println("0");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Satisfy obj = new Satisfy();
		obj.Condition(51);
	}

}
