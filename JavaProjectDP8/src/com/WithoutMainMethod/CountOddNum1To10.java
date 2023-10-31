package com.WithoutMainMethod;

import java.util.Scanner;

public class CountOddNum1To10 {
	public int Count(int a) {
		int count = 0;
		for (int i = 1; i <= a; i++) {
			if (i % 2 != 0)

				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter num");
		num = sc.nextInt();
		CountOddNum1To10 obj = new CountOddNum1To10();
		int res = obj.Count(num);
		System.out.println(res);
	}

}
