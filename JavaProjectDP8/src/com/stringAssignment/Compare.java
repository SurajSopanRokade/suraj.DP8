package com.stringAssignment;
//7.  Write a Java program to compare two strings.
public class Compare {
	public static void compare() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Suraj";
		String str1="Suraj";
		
		char ch[]=str.toCharArray();
		char ch1[]=str1.toCharArray();
		int count=0;
		for (int i=0; i<str.length(); i++) {
			if (ch[i]!=ch1[i]) {
				count=1;
			    break;
			}
		}
		if (count==0)
			System.out.println("Same");
		else if (count==1)
			System.out.println("Not same");
	}

}
