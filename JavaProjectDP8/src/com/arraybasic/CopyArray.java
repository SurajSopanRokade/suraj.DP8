package com.arraybasic;

import java.util.Scanner;

//4.	WAP to copy an array by iterating the array.
public class CopyArray {
	public static int[] copyArray(int n[]) {
		int arr1 [] = new int[n.length];
		for (int i=0; i<n.length; i++) {
			arr1[i]=n[i];
			
		}
		return arr1;
	}
	public static void copyArray1(int t[]) {
		
		for (int i=0; i<t.length; i++) {
			
			System.out.print(t[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5,6};
		int a[]=copyArray(arr);
		copyArray1(a);
	}

}
