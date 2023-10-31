package com.WithoutMainMethod;

import java.util.Scanner;

public class Armstrong {
	public boolean NumArmstrong(int a) {
		int sum = 0;
		int rem;
		int original = a;
		int count;
		
		while (a > 0) {
			rem = a % 10;
			rem = rem * rem * rem;
			sum = sum + rem;
			a = a / 10;
		}
		if (original == sum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter num");
		num = sc.nextInt();
		Armstrong obj = new Armstrong();
		boolean res = obj.NumArmstrong(num);
		if (res)
			System.out.println("Number is armstrong");
		else
			System.out.println("Number is not armstrong");

	}

}
