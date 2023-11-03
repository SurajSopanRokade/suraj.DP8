package com.arraybasic;

import java.util.Arrays;

//9.	WAP to put even and odd elements of array in two separate arrays.
public class EvenOddArrays {
	public static int[] evenArray(int n[]) {
		int count=0;
		for (int i=0; i<n.length; i++) {
			if (n[i]%2==0)
				count++;
		}
		
		int k[]= new int[count];
		int p=0;
		for (int j=0; j<n.length; j++) {
			if (n[j]%2==0) {
				k[p]=n[j];
				p++;
			}
		}
		return k;
	}
	public static int[] evenArray1(int odd[]) {
		int count=0;
		for (int i=0; i<odd.length; i++) {
			if (odd[i]%2!=0)
				count++;
		}
		
		int k[]= new int[count];
		int p=0;
		for (int j=0; j<odd.length; j++) {
			if (odd[j]%2!=0) {
				k[p]=odd[j];
				p++;
			}
		}
		return k;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {2,3,4,5,6,7,8,9};
       int j[]=evenArray(arr);
       System.out.println(Arrays.toString(j));
       int y[]=evenArray1(arr);
       System.out.println(Arrays.toString(y));
	}

}
