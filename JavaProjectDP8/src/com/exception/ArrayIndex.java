package com.exception;

import java.util.Scanner;

//1. WAP which throws ArrayIndexOutBoundsException. 
//In the console, observe the stack trace and the 
//line number from where the Exception is thrown
public class ArrayIndex {
	public int array(int n[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index");
		int index=sc.nextInt();
		if (index>=n.length) {
			throw new Exception();
		}
		return n[index];
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int ele=0;
		int arr[] = {1,2,3,4,5,6};
		ArrayIndex a1 = new ArrayIndex();
		try {
		ele=a1.array(arr);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Element" + ele);
		System.out.println("ends...");
	}

}
