package com.WithoutMainMethod;

import java.util.Scanner;

public class Addition {
	public int AdditionOfTwoNumbers(int i, int j) {

		int sum = (i + j);

		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.println("Enter the num1");
		num1 = sc.nextInt();
		int num2;
		System.out.println("Enter the num2");
		num2 = sc.nextInt();
		Addition obj = new Addition();
		int res = obj.AdditionOfTwoNumbers(num1, num2);
		System.out.println(res);
	}

}
