package com.WhileLoop;

import java.util.Scanner;

public class CalculatorString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.println("Enter the num1");
		num1 = sc.nextInt();
		int num2;
		System.out.println("Enter the num2");
		num2 = sc.nextInt();
		System.out.println(" Enter your choise addition, substraction,division, multi");
		char ch;
		String operation;

		do {

			System.out.println(" Enter your choise addition, substraction,division, multi");
			operation = sc.next();

			switch (operation) {
			case "addition":
				System.out.println(num1 + num2);
				break;
			case "substraction":
				System.out.println(num1 - num2);
				break;
			case "division":
				System.out.println(num1 / num2);
				break;
			case "multi":
				System.out.println(num1 * num2);
				break;
			default:
				System.out.println("invalid input");

			}
			System.out.println("Do you want to continue...type Y Or y");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}
}
