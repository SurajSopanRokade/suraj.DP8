package com.conditional;
import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Character =");
		char ch = sc.next().charAt(0);
		
		if ( ch=='A') 
		{ 
			System.out.println("Vowel");
		}
		else if (ch=='E')
		{
			System.out.println("Vowel");
		}
		else if (ch=='I')
		{
			System.out.println("Vowel");
		}
		else if (ch=='O')
		{
			System.out.println("Vowel");
		}
		else if (ch=='U')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Conconent");
		}

	}

}
