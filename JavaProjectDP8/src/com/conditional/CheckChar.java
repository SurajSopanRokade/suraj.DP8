package com.conditional;
import java.util.Scanner;
public class CheckChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the character");
	    ch=sc.next().charAt(0);
	
		if (ch>='A' && ch<='Z')
		System.out.println("It is Alphabet");
		
	
        else if (ch>='a' && ch<='z')
        System.out.println("It is Alphabet");
		
        else
        System.out.println("Any other character");
        
		

	}

}
