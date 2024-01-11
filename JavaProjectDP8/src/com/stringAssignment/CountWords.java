package com.stringAssignment;
//14.  Write a Java program to count total number of words in a string.
public class CountWords {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " Suraj Rokade Hello";
		int j=0; 
		int temp=32;
		for (int i=0; i<str.length(); i++) {
			if ( str.charAt(i)==32 ) {
				j++;
			}
			
		 if (str.charAt(i)!=32) {
				continue;
			}
			
			
			
		}
		System.out.println("Count " + (j));
	}

}
