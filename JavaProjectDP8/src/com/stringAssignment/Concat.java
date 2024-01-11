package com.stringAssignment;

import java.util.Arrays;

//6.  Write a Java program to concatenate two strings.
public class Concat {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Suraj";
		String str2="Rokde";
		String str3=str1.concat(str2);
		//System.out.print(str3); //Using concat method
		
		char ch[]=str1.toCharArray();
		char ch1[]=str2.toCharArray();
		
		char ch3[]= new char[ch.length+ch1.length];
		int a=0;
//		for (int i=0; i<ch.length; i++) {
//			ch3[a++]=ch[i];
//		}
//		for (int j=0; j<ch1.length; j++) {
//			ch3[a++]=ch1[j];
//		}
//		for (int i=0; i<ch3.length; i++) {
//			System.out.print(ch3[i]+" ");
//		}
		int cnt=0;
		for(int i=0; i<ch3.length;i++)
		{
			if(i<=ch.length-1)
			{
				ch3[i]=ch[i];
				
			}
			else if(i>=ch.length)
			{
				ch3[i]=ch1[cnt];
				cnt++;
			}
		}
		System.out.println(Arrays.toString(ch3));
	}

}
