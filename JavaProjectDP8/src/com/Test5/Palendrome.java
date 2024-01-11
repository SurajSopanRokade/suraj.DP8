package com.Test5;
//14> Special words are those words which starts and ends with the same letter.
//Examples: EXISTENCE, COMIC, WINDOW.
//Palindrome words are those words which read the same from left to right and vice-versa.
//Examples: MALAYALAM, MADAM, LEVEL, ROTATOR, CIVIC.
//All palindromes are special words, but all special words are not palindromes.
//Write a program to accept a word, 
//check and print whether the word is a palindrome or only special.[2M]
public class Palendrome {
	public void check(String n) {
		char ch[]=n.toCharArray();
		int u=ch.length-1;
		int count=0;
		for (int i=0; i<ch.length; i++) {
			if (ch[i]==ch[u])
				count++;
				u--;
		}
			
		if (count==ch.length)
			System.out.println("Is palendrome");
		else if (ch[0]==ch[ch.length-1])
			System.out.println("Is special char");
		else
			System.out.println("Not special char and not palendrome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palendrome p1 = new Palendrome();
		p1.check("SuuruuS");
	}

}
