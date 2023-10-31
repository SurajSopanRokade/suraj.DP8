package com.WithoutMainMethod;

import java.util.Scanner;

public class Substraction {
	public int SubOfTwoNumbers(int i, int j) {
		int sub = i - j;
		return sub;
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
		Substraction obj = new Substraction();
		int res = obj.SubOfTwoNumbers(num1, num2);
		System.out.println(res);
	}

}
