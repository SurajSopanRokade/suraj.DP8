package com.arraybasic;

import java.util.Scanner;

public class PrimeNo {
	public static void primeNo(int n[]) {
		for (int i = 0; i < n.length; i++) {
			int count = 0;
			for (int j = 2; j < n[i]; j++) {
				if (n[i] % j == 0) {
					count = 1;
					break;
				}
			}
			if (count == 0)
				System.out.println(n[i]);

		}
	}

	public static int[] createArray() {
		int num[];
		System.out.println("Enter size of Array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		num = new int[size];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter array " + (i + 1) + " Elements ");
			num[i] = sc.nextInt();

		}
		sc.close();
		return num;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[] = createArray();
		primeNo(k);

	}

}
