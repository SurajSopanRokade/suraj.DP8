package com.NestedLoop;

public class Loop9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   for (int i=1; i<=4; i++)
   {
	   for (int j=4; j>=i; j--)
	   {
		   System.out.print(j);
	   }
	   System.out.println();
   }
	}

}
