package com.stringAssignment;
//12.  Write a Java program to count occurrences of a character in given string.
public class CountOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="adfedsssaao";
		
		char ch[]=str.toCharArray();
		for (int i=0; i<ch.length; i++) {
			int count=0;
			for (int j=i+1; j<ch.length; j++) {
				if (ch[i]==ch[j]) {
					count++;
				}
			}
			if(count!=0) {
				boolean NotOccured= true;
				for (int k=i-1; k>=0; k--) {
					if (ch[i]==ch[k])
						NotOccured=false;
				}
				if(NotOccured)
					System.out.println("Chara "+ch[i]+" "+(count+1));
			}
		}
	}

}
