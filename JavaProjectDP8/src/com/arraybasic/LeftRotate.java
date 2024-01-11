package com.arraybasic;
//1.	WAP to left rotate an array.
public class LeftRotate {
	public static void leftrotate() {
		int arr[]= {1,47,64,12,7,6,54,5,2};
		
		int n=2;
		for (int j=0; j<n; j++) {
			int ele=arr[0];
		for (int i=0; i<arr.length-1; i++) {
			
				arr[i]=arr[i+1];
			
			//System.out.print(arr[i]+" ");
			
		}
		arr[arr.length-1]=ele;
		//System.out.print(arr[arr.length-1]+" ");
		}
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leftrotate();
	}

}
