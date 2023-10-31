package com.WithoutMainMethod;
import java.util.Scanner;
public class CheckDivisible5and11 {
  public boolean CheckNum(int a)
  {
	  if (a%5==0 && a%11==0)
		 return true;
	  else
		  return false;

  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  int num;
  System.out.println("Enter num");
  num=sc.nextInt();
  CheckDivisible5and11 obj = new CheckDivisible5and11();
  boolean res=obj.CheckNum(num);
  if (res)
	  System.out.println("Number is divisible by 5 and 11");
  else
	  System.out.println("Number is not divisible by 5 and 11");
  
  
  
	}

}
