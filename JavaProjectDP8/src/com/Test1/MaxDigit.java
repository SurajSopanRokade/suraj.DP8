package com.Test1;
//Q2. Write Java Program to find highest digit among the digits forming a number.
//E.g. If number given is 6745, then output should be 7.	
public class MaxDigit {
	public void checkDigit(int a)
	{
		int digit=a%10;
		a=a/10;
		while (a>0) {
			int rem=a%10;
			if (digit<rem)
			{
				digit=rem;
			}
			a=a/10;
		}
		System.out.println(" Max Digit " + digit);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxDigit m1 = new MaxDigit();
		m1.checkDigit(69458);
	}

}
