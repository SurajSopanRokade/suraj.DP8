package com.stringAssignment;
//5.  Write a Java program to find length of a string.
public class ArrayLength {
	public static void length() {
		String str = "Suraj";
		int count=0;
		for (int i=0; i<str.length(); i++) {
			count++;
		}
		System.out.print(count);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		length();
		int count1=0;
		String str1= "Rokade";
		ArrayLength a1 = new ArrayLength();
		char ch[]=str1.toCharArray();
		for (int i=0; i<ch.length; i++) {
			System.out.println(ch[i]+" ");
		}
		System.out.println(ch.length);
	}
	

}
