package com.arraybasic;
//2.	WAP to right rotate an array.
public class RotateRight {
	public static void rightRotate() {
		int arr[]= {23,45,56,76,8,89,1};
		int n=1;
		for (int i=0; i<n; i++) {
			int j,last;
			last=arr[arr.length-1];
			for ( j=arr.length-1; j>0; j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		System.out.println();
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rightRotate();
	}

}
