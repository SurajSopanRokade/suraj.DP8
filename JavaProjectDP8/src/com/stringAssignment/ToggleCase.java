package com.stringAssignment;

import java.util.Arrays;

//22.  Write a Java program to toggle case of each character of a string.
public class ToggleCase {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "SuRaJ";
		char ch[]=str.toCharArray();
		char ch1[]= new char[ch.length];
		for (int i=0; i<ch.length; i++) {
			if(ch[i]>='A'&& ch[i]<='Z')
				ch1[i]=(char)(ch[i]+32);
			else if (ch[i]>='a'&& ch[i]<='z')
				ch1[i]=(char)(ch[i]-32);
		}
		System.out.print(Arrays.toString(ch1));
	}

}
