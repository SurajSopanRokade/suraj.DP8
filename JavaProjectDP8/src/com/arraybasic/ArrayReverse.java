package com.arraybasic;

import java.util.Arrays;
//17.	WAP to reverse the array itself, don’t print array in reverse – 
//I want current array reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78] 
//so your same array must be [78, 37, 29, 45, 90, 3] without using temporary array.
public class ArrayReverse {
	public static void reverse() {
		int arr[]= {12,45,23,56,34};
		int temp;
		int i=0;
			for (int j=arr.length-1; j>=0; j--) {
				if (i!=j && i<j) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					i++;
				}
		}
		System.out.print(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse();
		
	}

}
