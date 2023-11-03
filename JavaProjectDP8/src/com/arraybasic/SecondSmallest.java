package com.arraybasic;

import java.util.Scanner;

//13.	WAP to find the second smallest element in an array.
public class SecondSmallest {
	public static void secondSmallest(int n[]) {
		int count=0;
		int t=0;
		for(int i=0; i<n.length; i++) {
			 count=0;
			for (int j=0; j<n.length; j++) {
				if(i!=j && n[i]>n[j]) {
					count++;
					t=i;
				}
			}
			if (count==1)
				System.out.println("Second smallest number "+n[t]);
		}

	}
	public static int [] createArray() {
		int n[];
		System.out.println("Enter size of Array ");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		n= new int[size];
		for (int i=0; i<n.length; i++) {
			System.out.println("Enter " + (i+1) + " Element " );
			n[i]=sc.nextInt();
			
		}
		sc.close();
		return n;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]=createArray();
		secondSmallest(k);
	}

}
