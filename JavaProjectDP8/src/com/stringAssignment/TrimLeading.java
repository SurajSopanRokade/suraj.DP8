package com.stringAssignment;
//13.  Write a Java program to trim leading white space characters in a string.
public class TrimLeading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "  java ";
		int j=0;
		str=str.stripLeading();
		for (int i=0; i<str.length(); i++) {
			if (j<str.length()&&str.charAt(j)==32)
				j++;
		}
		System.out.println(j);
		str =str.substring(j,str.length());
		System.out.println(str);
		
	}

}
