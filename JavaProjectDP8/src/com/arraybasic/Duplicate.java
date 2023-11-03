package com.arraybasic;

import java.util.Scanner;

//11.	WAP to find and count total number of duplicate elements in an array.
public class Duplicate {
	public static void countDuplicate(int n[]) {
		int b=0;
		for (int i=0; i<n.length; i++) {
			int count=0;
			for (int j=0; j<n.length; j++) {
				if (i!=j && n[i]==n[j]) {
					
					count++;
				}
			}
			
			if (count!=0 && b!=n[i]) 
			   System.out.println("Duplicate element "+ n[i] +" count "+(count+1));
			b=n[i];
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
		countDuplicate(k);
	}

}
