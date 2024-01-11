package com.stringAssignment;
//23.  Write a Java program to count total number of vowels and consonants in a string.
public class VowelsConsonent {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="SurajU";
		char ch[]= str.toCharArray();
		int vow=0;
		int con=0;
		for (int i=0; i<ch.length; i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i'|| ch[i]=='o' || ch[i]=='u'|| 
			   ch[i]=='A' || ch[i]=='E' || ch[i]=='I'|| ch[i]=='O' || ch[i]=='U')
			vow++;
			else
			con++;
		}
		System.out.println("Vowels " + vow +"\n"+" Consonants " + con);
	}

}
