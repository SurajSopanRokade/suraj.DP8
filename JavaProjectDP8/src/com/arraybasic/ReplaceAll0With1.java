package com.arraybasic;
//6.	WAP to replace all the 0’s with 1’s in your array. 
//Your array is [26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34].
public class ReplaceAll0With1 {
	public static void replace() {
		int arr[]= {26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34};
		for (int i=0; i<arr.length; i++ ) {
			if(arr[i]==0)
				arr[i]=1;
		}
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replace();
	}

}
