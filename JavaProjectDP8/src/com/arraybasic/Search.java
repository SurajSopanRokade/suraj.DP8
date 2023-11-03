package com.arraybasic;
import java.util.Scanner;
//3.	WAP to search for a given number in an array and accordingly print the index if exists.
public class Search {
	public static void searchnum(int n[], int a) {
		int count=0;
		for (int i=0; i<n.length; i++) {
			if (n[i]==a)
				count=i;
		}
		if (count==0)
			System.out.println("Number not exist");
		else
			System.out.println("Number exist at array index " + count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,23,34,45,56};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		searchnum(arr, num);
		sc.close();
	}

}
