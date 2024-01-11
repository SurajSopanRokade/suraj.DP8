package com.stringAssignment;
//Check whether String is Anagram.
public class Anagram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Suraj";
		String str1 = "uSrja";
		char ch[]=str.toCharArray();
		char ch1[]=str1.toCharArray();
		int count=0;
		for (int i=0; i<ch.length; i++) {
			
			for (int j=0; j<ch.length; j++) {
				if (ch[i]==ch1[j])
					count++;
					
				
			}
		}
		
		if (count==ch.length)
			System.out.print("Anagram");
		else
			System.out.print("Not Anagram");
	}

}
