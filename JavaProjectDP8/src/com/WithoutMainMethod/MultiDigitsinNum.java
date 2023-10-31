package com.WithoutMainMethod;

import java.util.Scanner;

public class MultiDigitsinNum {
	public int MultiDigits(int a) {
		int multi = 1;
		while (a > 0) {
			int rem = a % 10;
			multi = multi * rem;
			a = a / 10;
		}
		return multi;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter num");
		num = sc.nextInt();
		MultiDigitsinNum obj = new MultiDigitsinNum();
		int res = obj.MultiDigits(num);
		System.out.println(res);

	}

}
