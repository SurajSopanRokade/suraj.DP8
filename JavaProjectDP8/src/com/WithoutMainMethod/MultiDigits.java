package com.WithoutMainMethod;

import java.util.Scanner;

public class MultiDigits {
	public int MultiplicationDigits(int a) {
		int multi = 1;
		for (int i = 0; i != a;) {
			int digit = a % 10;
			multi = multi * digit;
			a = a / 10;
		}
		return multi;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("enter num");
		num = sc.nextInt();
		MultiDigits obj = new MultiDigits();
		int res = obj.MultiplicationDigits(num);
		System.out.println(res);

	}

}
