package com.Test4;

public class AToThePowerB {
	public void check(int a, int b) {
		int power=1;
		for (int i=1; i<=b; i++) {
			power=power*a;
		}
		System.out.println("Power = " + power);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AToThePowerB a1 = new AToThePowerB();
		a1.check(4, 3);
	}

}
