package com.ArrayOfObject;
//4.	Write a Java program to test the equality of two arrays. 
//Means e.g arr1[] = [12, 22, 32, 42, 52, 62] and arr2[] = [52, 22, 62, 12, 42, 22] 
//Here both arrays are equal.
public class CheckArrayEqual {
	public static void equal() {
		int arr1[] = {12, 22, 32, 42, 52, 62};
		int arr2[] = {52, 32, 62, 12, 42, 22};
		int count=0;
		for (int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					count++;
					break;
				}
			}
		}
		if (count==arr1.length)
		System.out.println("Equal")	;
		else
		System.out.println("Not equal");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		equal();
	}

}
