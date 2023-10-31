package com.NestedLoop;

public class Pattern13 {
  public void Pattern (int a)
  {
	  for (int i=1; i<=a; i++)
	  {   char ch='F';
		  for (int j=a; j>=i; j-- )
		  {
			  System.out.print(ch--);
		  }
		  System.out.println();
	  }
  }
	public static void main(String[] args) {			
		// TODO Auto-generated method  
		Pattern13 obj =new Pattern13();
		obj.Pattern(6);
	}

}
