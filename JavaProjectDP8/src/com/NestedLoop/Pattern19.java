package com.NestedLoop;

public class Pattern19 {
  public void pattern(int a)
  {
	  for (int i=1; i<=a; i++)
	  {
		 for (int k=2; k<=i; k++)
		 {
			 System.out.print(" ");
		 }
		 for (int j=a; j>=i; j--)
		 {
			 System.out.print(" "+"*");
		 }
		 System.out.println();
	  }
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern19 obj =new Pattern19();
		obj.pattern(10);
	}

}
