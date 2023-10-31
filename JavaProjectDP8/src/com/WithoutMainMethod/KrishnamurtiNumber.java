package com.WithoutMainMethod;

import java.util.Scanner;

public class KrishnamurtiNumber {
	public boolean Krishnamurti(int a) {
		int original = a;
		int sum = 0;
		while (a > 0) {
			int rem = a % 10;

			int fact = 1;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			a = a / 10;
		}
		if (sum == original)
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
		KrishnamurtiNumber obj = new KrishnamurtiNumber();
		boolean res = obj.Krishnamurti(num);
		if (res)
			System.out.println("Krishnamurti number");
		else
			System.out.println("Not Krishnamurti number");

	}

}
