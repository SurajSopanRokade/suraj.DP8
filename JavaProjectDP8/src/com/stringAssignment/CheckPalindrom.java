package com.stringAssignment;
//Check whether String is palindrome
public class CheckPalindrom {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "SurtS";
		char ch[]= str.toCharArray();
		char ch1[]= new char[ch.length];
		int u=ch.length-1;
		int count=0;
		for (int i=0; i<ch.length; i++) {
			if(ch[i]==ch[u])
			count++;
			u--;
		}
		String str1= new String(ch1);
		if (count==5)
		System.out.print("Is palendrome");
		else 
		System.out.print("Is not palendrome");
	}

}
