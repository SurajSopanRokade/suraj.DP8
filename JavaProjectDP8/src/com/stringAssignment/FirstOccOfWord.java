package com.stringAssignment;
import java.util.Scanner;
//15.  Write a Java program to find first occurrence of a word in a given string.
public class FirstOccOfWord {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Enter the word";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String w=sc.next();
		
		
		for (int i=0; i<str.length(); i++) {
			int j;
			String temp="";
			for (j=i; j<str.length()&& str.charAt(j)!=32; j++) {
				temp+=str.charAt(j);
			}
			if(temp.equals(w)) {
				System.out.println("The index of word is " +(j-temp.length()) );
				break;
			}
		}
	}

}
