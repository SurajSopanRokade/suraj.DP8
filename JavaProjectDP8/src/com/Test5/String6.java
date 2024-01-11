package com.Test5;
//6> Given sentence and a word, find if the word can be formed from given characters 
//in sentence.   [2M]
//
//For example, 
//s1=”THE SKY IS THE LIMIT”
//word = "AXE", -> No 
//word = "SIT", -> Yes can be formed
//word = "AMIT", -> Yes can be formed
public class String6 {
	public static void check() {
		String s1="THE SKY IS THE LIMIT";
		String w="SIT";
		int count=0;
		char ch[]=s1.toCharArray();
		char ch1[]=w.toCharArray();
		for (int i=0; i<ch1.length; i++) {
			 count=0;
			for (int j=0; j<ch.length; j++) {
				if (ch1[i]==ch[j]) 
					count++;
			}
			
		}
		if (count==ch1.length)
			System.out.println("Yes can be formed");
		else
			System.out.println("No");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
	}

}
