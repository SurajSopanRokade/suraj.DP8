package com.WithoutMainMethod;

import java.util.Scanner;

public class Bouncynum {
	int coun = 0;
	int f=0;

	public int countdigits(int c) {
		while (c > 0) {
			int r = c % 10;

			if (r != f) {
				coun++;
			}
			c = c / 10;
			f = r;
		}

		return coun;

	}

	public int checkNum(int a) {
		

		int digit = a % 10;
		a = a / 10;

		int count = 0;
		while (a > 0) {
			int rem = a % 10;
			if ((digit < rem))
				count++;

			digit = rem;
			a = a / 10;

		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num = sc.nextInt();
		Bouncynum obj = new Bouncynum();
		int res = obj.checkNum(num);
		int cnt = obj.countdigits(num);

		if (res == 0)
			System.out.println("increasing");
		else if (res == cnt - 1)
			System.out.println("decreasing");
		else
			System.out.println("Bouncy number");

	}

}
