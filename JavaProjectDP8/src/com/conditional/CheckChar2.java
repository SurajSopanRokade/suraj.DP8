package com.conditional;
import java.util.Scanner;
public class CheckChar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println ("Enter the character");
    ch=sc.next().charAt(0);
    
    if ((ch>='a') && (ch<='z') || (ch>='A') && (ch<='Z'))
    	System.out.println("It is alphabet");
    else 
    	System.out.println("It is not alphabet");
	}

}
