package com.stringAssignment;
//11.  Write a Java program to find first occurrence of a character in a given string.
import java.util.Scanner;
public class FirstOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Rokade";
		int y=str.indexOf('a');
		System.out.println(y);
		System.out.println("Enter the character ");
		Scanner sc = new Scanner(System.in);
		char ch1=sc.next().charAt(0);
		char ch []=str.toCharArray();
		for (int i=0; i<ch.length; i++) {
			if(ch1==ch[i])
				System.out.println(i);
		}
	}

}
