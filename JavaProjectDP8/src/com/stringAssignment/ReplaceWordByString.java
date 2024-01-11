package com.stringAssignment;

import java.util.Arrays;
import java.util.Scanner;

//Replace the particular word from string by another string.
public class ReplaceWordByString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Rokade and";
		String str3="and";
		
		//System.out.println(str1.replace("and", "Suraj"));
		String str2[]=str1.split(" ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word to replace");
		String word=sc.next();
		for (int i=0; i<str2.length; i++) {
			
			if (str2[i].equals(str3))
			  str2[i]=word;
		}
		//System.out.println(Arrays.toString(str2));
		String str4 = String.join(" ",str2);
		//System.out.println(str4);
		String str5="";
		for (int i=0; i<str2.length; i++) {
			str5=str5+str2[i]+" ";
		}
		System.out.println(str5);
	}
	

}
