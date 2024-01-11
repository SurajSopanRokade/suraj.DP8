package com.stringAssignment;
import java.util.Scanner;
//16.  Write a Java program to search all occurrences of a character in given string.
public class AllOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="my name is suraj";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch1= sc.next().charAt(0);
		char ch[]= str.toCharArray();
		for (int i=0; i<ch.length; i++) {
			if (ch[i]==ch1)
				System.out.println(ch1+" "+i);
		}
	}

}
