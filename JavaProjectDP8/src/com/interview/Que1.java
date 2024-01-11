package com.interview;

import java.util.Arrays;

//2)A word is alphabetically sorted if all of the letters in it are in consecutive alphabetical order. Some examples of alphabetically sorted words: abhors (a is before b, b is before h, h is before o, etc.), ghost, accent, hoop.
//
//
//
//Create a function that takes in a sentence as input and returns true if there is at least one alphabetically sorted word inside that has a minimum length of 3.
//
// 
//
//foo("Paula has a French accent.") ➞ true
//// "accent" is alphabetically sorted.
//
// 
//
//foo("The biopsy returned negative results.") ➞ true
//// "biopsy" is alphabetically sorted.
//
// 
//
//foo("She sells sea shells by the sea shore.") ➞ false
//// Although "by" is alphabetically sorted, it is only 2 letters long.
//
// 
//
//*Do not count words with 2 or fewer characters.
//*Ignore punctuation (periods, commas, etc)
public class Que1 {
	public int sort(String str) {
		int count=0;
		int t=0;
		int leng=0;
		String str1[] = str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			str1[i] = str1[i].toUpperCase();
			char ch[] = str1[i].toCharArray();
			t=0;
			leng=ch.length;
			for (int j=0; j<ch.length; j++) {
				count=0;
				for (int k=j+1; k<ch.length; k++) {
					if(ch[j]<=ch[k])
						count++;
					else 
						break;
				}
				if (count>0) {
					t++;
				}
				
			}
			
			if (t==ch.length-1&&ch.length>2) {
				
				leng = 1;
				break;
			}
			
			
		
		

	}
		return leng;
		
		
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Paula has a French accent";
		Que1 q1 = new Que1();
		int res=q1.sort(str);
		if (res==1) 
			System.out.println("true");
		else
			System.out.println("false");	
		
	}

}
