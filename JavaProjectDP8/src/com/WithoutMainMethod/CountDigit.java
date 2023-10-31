package com.WithoutMainMethod;

import java.util.Scanner;

public class CountDigit {
	public int CountnumberOfDigits(int a) {
		int count = 0;
		int rem;
		for (int i = 0; i < a;) {
			rem = a % 10;
			a = a / 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num = sc.nextInt();
		CountDigit obj = new CountDigit();
		int res = obj.CountnumberOfDigits(num);
		System.out.println(res);
	}

}
