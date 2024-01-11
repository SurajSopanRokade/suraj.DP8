package com.stringAssignment;
//8.  Write a Java program to convert lowercase string to uppercase.

public class LowerToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="suraj";
		String str1;
		System.out.println(str.toUpperCase());//By method
		
		char ch[]= str.toCharArray();
		for (int i=0; i<ch.length; i++) {
			if (ch[i]>='a' && ch[i]<='z') {
				ch[i]=(char)(ch[i]-32);
			}
		}
		for (int i=0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
		
	}

	

}
