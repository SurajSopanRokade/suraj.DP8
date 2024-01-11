package com.stringAssignment;

import java.util.Arrays;

//10.  WAP to split string into 2 tokens where string is “HELLO$WORLD”
public class Split {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HELLOW$WORLD";
		
		String s[]=str.split("\\$",3);
		//System.out.println(Arrays.toString(s));
		int b=0;
		char ch[]=str.toCharArray();
		char ch1[]= new char[ch.length];
		int count=0;
		for (int i=0 ; i<ch.length; i++) {
			if (ch[i]=='$')
				b=i;
		}
		System.out.println("Count"+b);
		char ch2[]= new char[b];
		char ch3[]= new char[b];
		int u=0;
		for (int i=0; i<ch2.length; i++) {
			ch2[i]=ch[u++];
		}
		System.out.println(Arrays.toString(ch2));
		for (int i=0; i<ch3.length; i++) {
			ch3[i]=ch[u++];
		}
		System.out.println(Arrays.toString(ch3));
	}

	}
