package com.arraybasic;

import java.util.Scanner;

public class LessThanAve {
	public static int average(int n[]) {
		int sum=0;
		for (int i=0; i<n.length; i++) {
			sum=sum+n[i];
		}
		int average = sum/n.length;
		
		return average;

	}
	public static void check(int t[], int avg) {
		for (int i=0; i<t.length; i++) {
			if (t[i]<avg)
				System.out.println(t[i]);
		}
	}
	public static int [] createArray() {
		int num[];
		System.out.println("Enter size of Array");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		num = new int [size];
		for (int i=0; i<num.length; i++) {
			System.out.println("Enter array " + (i+1)+ " Elements ");
			num[i]=sc.nextInt();
			
		}
		sc.close();
		return num;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]=createArray();
		int a=average(k);
		check(k, a);
	}

}
