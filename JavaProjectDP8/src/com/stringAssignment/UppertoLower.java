package com.stringAssignment;

import java.util.Arrays;

//17.  Write a Java program to convert uppercase string to lowercase.
public class UppertoLower {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Suraj Rokade";
		char ch[]=str.toCharArray();
		for (int i=0; i<ch.length; i++) {
			if(ch[i]>'A'&& ch[i]<'Z') {
				ch[i]=(char)(ch[i]+32);
			}
		}
		for (int i=0 ; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
	}

}
