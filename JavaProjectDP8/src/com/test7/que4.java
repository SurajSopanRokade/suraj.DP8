package com.test7;

public class que4 {
	private static int incrementCounter(int i) { 
		return ++i;}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6 };  
		for (int i = 0; i < arr.length; incrementCounter(i)) { 
			System.out.println(i);                          
		}  
	}
		
}

