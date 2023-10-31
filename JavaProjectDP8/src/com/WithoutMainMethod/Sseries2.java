package com.WithoutMainMethod;

import java.util.Scanner;

public class Sseries2 {
	public int SeriesOfSumOfFacto(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			int fact = 1;
			for (int j = 1; j <= i; j++) {
				fact = fact * j;

			}

			sum = sum + fact;

		}
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter num");
		num = sc.nextInt();
		Sseries2 obj = new Sseries2();
		int res = obj.SeriesOfSumOfFacto(num);
		System.out.println(res);
	}

}
