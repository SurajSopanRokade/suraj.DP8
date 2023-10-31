package com.Test1;
//Q11. Write a code in java to display small alphabets in reverse order ie. from z,y,x…..b,a.   
public class Alpha {
	public void revAlpha()
	{
		char ch;
		ch='z';
		for (char i='z'; i>='a'; i--)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha a1 = new Alpha ();
		a1.revAlpha();
	}

}
