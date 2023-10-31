package com.WithoutMainMethod;

import java.util.Scanner;

public class HarshadWhile {
	public boolean Harshadnum(int a) {
		int original = a;
		int sum = 0;
		int rem;
		while (a != 0) {
			rem = a % 10;
			sum = sum + rem;
			a = a / 10;
		}
		a = original;
		if (a / sum == 0)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter num");
		num = sc.nextInt();
		HarshadNumber obj = new HarshadNumber();
		boolean res = obj.CheckNum(num);
		if (res)
			System.out.println("Number is Harshad");
		else
			System.out.println("Number is not Harshad");
	}

}
