package com.arraybasic;

import java.util.Scanner;

public class MaxMin {
	
	public static void max(int n[]) {
		int Ele1=n[0];
		for (int i=1; i<n.length; i++) {
			if (Ele1<n[i])
				Ele1=n[i];
		}
		System.out.println("Max array element " + Ele1);
	}
	public static int min(int n[], int a) {
		
		int Ele1=n[0];
		for (int i=1; i<n.length; i++) {
			if (Ele1>n[i] && n[i]!=a) 
				Ele1=n[i];
		}
		a=Ele1;
		return a;
		//System.out.println("Min array element " + Ele1);
		
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
//		max(k);
		int num=0;
		int m=min(k, num);
		
		int m1= min(k, m);
		System.out.println(m1);
	}

}
