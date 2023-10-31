package com.Loops;

import java.util.Scanner;

public class FuelBarrelPrice {
	public void barrelPrice(int a) {
		while (a != 0) {
			if (a <= 10) {
				System.out.println(" Price = " + 89 * a);
				break;
			} else if (a <= 20) {
				System.out.println(" Price = " + (a * (89 - a)));
				break;
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Barrels;
		System.out.println("Enter number of barrels");
		Barrels = sc.nextInt();
		FuelBarrelPrice obj = new FuelBarrelPrice();
		obj.barrelPrice(Barrels);
	}
}
