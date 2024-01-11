package com.exception;

import java.util.Arrays;

//9. WAP to show 3 different scenario in which null pointer exceptions generated, 
//and handle that 
//exception.
public class NullPointer {
	public void array() {
		int arr[]=null;
		for(int i=0;i<=arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		String str =null;
		System.out.println(str.length());
		for(int i=0;i<=str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullPointer n1 = new NullPointer();
		try {
			n1.array();
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
	}

}
