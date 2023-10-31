package com.WithoutMainMethod;

import java.util.Scanner;

public class Prime {
	public boolean Checknum(int a) {
		int count = 0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0)
				count = 1;
		}
		if (count == 0)
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
		Prime obj = new Prime();
		boolean res = obj.Checknum(num);
		if (res)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");

	}

}
