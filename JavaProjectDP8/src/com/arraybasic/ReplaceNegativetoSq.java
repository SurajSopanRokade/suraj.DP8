package com.arraybasic;
//7.	WAP to replace all negative value with its immediate left elements square. 
//Means arr[] = [12, 3,-19, 29, 5, -61, 44, 7, -9] Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49].

public class ReplaceNegativetoSq {
	public static void replace() {
		int arr[] = {12, 3,-19, 29, 5, -61, 44, 7, -9};
		for (int i=0; i<arr.length; i++) {
			if(arr[i]<0)
				arr[i]=arr[i-1]*arr[i-1];
		}
		for (int j=0; j<arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replace();
	}

}
