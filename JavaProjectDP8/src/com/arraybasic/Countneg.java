package com.arraybasic;

import java.util.Scanner;

public class Countneg {
	public static void count(int n[]) {
		int count=0;
		for (int i=0; i<n.length; i++) {
			if (n[i]<0)
				count++;
		}
		System.out.println("Count is " + count);
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
		int k[]=createArray();
		count(k);
	}

}
