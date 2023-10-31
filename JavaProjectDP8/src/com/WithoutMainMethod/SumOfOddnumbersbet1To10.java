package com.WithoutMainMethod;

import java.util.Scanner;

public class SumOfOddnumbersbet1To10 {
	public int Sum(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			if (i % 2 != 0)
				sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter num");
		num = sc.nextInt();
		SumOfOddnumbersbet1To10 obj = new SumOfOddnumbersbet1To10();
		int res = obj.Sum(num);
		System.out.println(res);
	}

}
