package com.WithoutMainMethod;

import java.util.Scanner;

public class MaximumDigitFromNumber {
	public int MaxDigit(int a) {
		int largestDigit = 0;
		while (a > 0) {
			int rem = a % 10;
			a = a / 10;

			if (rem > largestDigit) {
				largestDigit = rem;

			}

		}
		return largestDigit;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter num");
		num = sc.nextInt();
		MaximumDigitFromNumber obj = new MaximumDigitFromNumber();
		int res = obj.MaxDigit(num);
		System.out.println(res);
	}

}
