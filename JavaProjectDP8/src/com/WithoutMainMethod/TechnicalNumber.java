package com.WithoutMainMethod;

import java.util.Scanner;

public class TechnicalNumber {
	public void Numbertechnical(int a) {
		int original = a;
		int count = 0;
		while (a != 0) {
			a = a / 10;
			count++;
		}

		int power = 1;
		for (int i = 1; i <= count / 2; i++) {
			power = power * 10;
		}
		if (count % 2 == 0) {
			int num1 = original / power;
			int num2 = original % power;
			int sum = num1 + num2;
			int square = sum * sum;
			if (square == original)
				System.out.println("Number is technical");
			else
				System.out.println("Number is not technical");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TechnicalNumber obj = new TechnicalNumber();
		obj.Numbertechnical(3025);
	}

}
