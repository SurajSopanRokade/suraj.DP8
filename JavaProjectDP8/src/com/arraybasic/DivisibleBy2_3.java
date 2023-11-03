package com.arraybasic;

import java.util.Scanner;

public class DivisibleBy2_3 {
	public static void divi(int n[]) {
		for (int i=0; i<n.length; i++) {
			if (n[i]%2==0 && n[i]%3==0)
				System.out.print(n[i]+" ");
		}
	}
	public static int[] createArray() {
		
		System.out.println("Enter the size of Array");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int [] num= new int[size];
		for (int i=0; i<num.length; i++) {
			System.out.println("Enter the array " +(i+1)+" Elements ");
			num[i]=sc.nextInt();
		}
		sc.close();
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]=createArray();
		divi(k);
	}

}
