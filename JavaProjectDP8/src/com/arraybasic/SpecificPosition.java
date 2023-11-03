package com.arraybasic;
import java.util.Arrays;
import java.util.Scanner;
//7.	WAP to insert an element in a specific position into an array.
public class SpecificPosition {
	public static void addElement(int n[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Array index position to insert element");
		int index=sc.nextInt();
		System.out.println("Give element");
		int ele=sc.nextInt();
//		for (int i=0 ;i<n.length; i++) {
//			if ((index-1)==i)
//				n[i]=ele;
//			System.out.print( n[i] + " ");
//		}
//		sc.close();
		
		int newArray []= new int[n.length+1];
		for (int k=0; k<index-1; k++) {
			newArray[k]=n[k];
		}
		newArray[index-1]=ele;
		
//		for (int j=0; j<newArray.length; j++) {
//			if((index-1)==j)
//				newArray[j]=ele;
//			System.out.print(newArray[j] + " ");
//		}
		for (int l=index-1; l<n.length; l++) {
			newArray[l+1]=n[l];
			System.out.println(newArray[l]+" ");
		}
		System.out.println(Arrays.toString(newArray));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,23,43,45,65};
		addElement(arr);
		
		
	}

}
