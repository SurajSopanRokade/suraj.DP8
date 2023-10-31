package com.WithoutMainMethod;

import java.util.Scanner;

public class Multiplication {
	public int MultiplicationOfTwoNumbers(int i, int j) {
		int multi = i * j;

		return multi;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.println("Enter num1");
		num1 = sc.nextInt();
		int num2;
		System.out.println("Enter num2");
		num2 = sc.nextInt();
		Multiplication obj = new Multiplication();
		int res = obj.MultiplicationOfTwoNumbers(num1, num2);
		System.out.println(res);

	}
}