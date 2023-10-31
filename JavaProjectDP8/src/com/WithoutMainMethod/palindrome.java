package com.WithoutMainMethod;

import java.util.Scanner;

public class palindrome {
	public int NumPalindrome(int a) {
		int revnum = 0;

		for (int i = 0; i != a;) {
			int rem = a % 10;
			revnum = revnum * 10 + rem;
			a = a / 10;
		}

		return revnum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter num");
		num = sc.nextInt();
		int original = num;
		palindrome obj = new palindrome();
		int res = obj.NumPalindrome(num);
		System.out.println(res);
		if (original == res)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");

	}

}
