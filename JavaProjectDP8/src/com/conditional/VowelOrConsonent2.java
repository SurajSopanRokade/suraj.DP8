package com.conditional;
import java.util.Scanner;

public class VowelOrConsonent2 {
	public static void main (String args []) {
Scanner sc =new Scanner (System.in);
 System.out.println("Enter Character");
 char ch;
 ch=sc.next().charAt(0);
 switch(ch)
 {
 case 'A': System.out.println("Alphabet");
 break;
 case 'E': System.out.println("Alphabet");
 break;
 case 'I': System.out.println("Alphabet");
 break;
 case 'O': System.out.println("Alphabet");
 break;
 case 'U': System.out.println("Alphabet");
 break;
 case 'a': System.out.println("Alphabet");
 break;
 case 'e': System.out.println("Alphabet");
 break;
 case 'i': System.out.println("Alphabet");
 break;
 case 'o': System.out.println("Alphabet");
 break;
 case 'u': System.out.println("Alphabet");
 break;
 default:System.out.println("Consonent");
 }
 
 
  

}
}