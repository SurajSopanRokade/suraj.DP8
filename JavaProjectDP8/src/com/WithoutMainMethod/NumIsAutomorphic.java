package com.WithoutMainMethod;

import java.util.Scanner;

public class NumIsAutomorphic {

	public boolean Count(int a) {
		int count = 0;
		int original = a;
		while (a > 0) {
			a = a / 10;
			count++;
		}
		System.out.println(count);

		int power = 1;
		for (int i = 1; i <= count; i++) {
			power = power * 10;
		}

		int num2 = original * original;
		int num3 = num2 % power;
		System.out.println(num3);
		if (num3 == original)
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
		NumIsAutomorphic obj = new NumIsAutomorphic();
		boolean res = obj.Count(num);
		if (res)
			System.out.println("Automorphic number");
		else
			System.out.println("Is Not Automorphic Number");
	}

}
