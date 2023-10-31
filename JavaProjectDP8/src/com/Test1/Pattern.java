package com.Test1;
//Q5.Write Java code to generate following pattern.				                 
//1234                                                                                                                                                              
//123                                                                                                                                                                    
//12                                                                                                                                                                       
//1

public class Pattern {
	public void pattern(int a)
	{
		for (int i=a; i>=1; i--)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p1 = new Pattern();
		p1.pattern(4);
	}

}
