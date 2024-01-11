package com.stringAssignment;

import java.util.Scanner;

//26.  Write a Java program to find last occurrence of a character in a given string.
public class LastOccu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Rokadeao";
		int y=str.indexOf('a');
		
		
		Scanner sc = new Scanner(System.in);
		char ch1=sc.next().charAt(0);
		char ch []=str.toCharArray();
		for (int i=ch.length-1; i>=0; i--) {
			if(ch1==ch[i]) {
				System.out.println(i);
				break;
			}
		}
	}

}
