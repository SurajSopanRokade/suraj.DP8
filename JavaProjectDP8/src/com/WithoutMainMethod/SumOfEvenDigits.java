package com.WithoutMainMethod;

import java.util.Scanner;

public class SumOfEvenDigits {
	public int SumOfeven(int a) {
		int sum = 0;
		while (a > 0) {
			int rem = a % 10;
			if (rem % 2 == 0) {
				sum = sum + rem;
			}
			a = a / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter num");
		num = sc.nextInt();
		SumOfEvenDigits obj = new SumOfEvenDigits();
		int res = obj.SumOfeven(num);
		System.out.println(res);
	}

}
