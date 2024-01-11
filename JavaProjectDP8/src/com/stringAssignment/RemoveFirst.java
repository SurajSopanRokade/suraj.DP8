package com.stringAssignment;
import java.util.Arrays;
import java.util.Scanner;
//30.  Write a Java program to remove first occurrence of a character from string.
public class RemoveFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch= sc.next().charAt(0);
		String str ="Rokade";
		char ch1[]=str.toCharArray();
		for (int i=0; i<ch1.length; i++) {
			if(ch1[i]==ch)
				ch1[i]='$';
		}
		int k=0;
		char ch2[] = new char[ch1.length-1];
		for (int i=0; i<ch1.length; i++) {
			if(ch1[i]!='$') {
				ch2[k]=ch1[i];
				k++;
			}
			
		}
		System.out.print(Arrays.toString(ch2));
	}

}
