package com.conditional;
import java.util.Scanner;
public class AlpDigitSpecial {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner (System.in);
   //int num;
  // num=sc.nextInt();
     char ch;
     ch=sc.next().charAt(0);
     
     
     if ((ch>='a') && (ch<='z'))
    	 System.out.println("Alphabet");
     else if ((ch>='0') && (ch<='9'))
    	 System.out.println("Number");
     else
    	 System.out.println("Special character");
     
}
}