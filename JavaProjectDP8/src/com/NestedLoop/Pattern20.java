package com.NestedLoop;

public class Pattern20 {
  public void Pattern(int a)
  {
	  for (int i=0; i<a; i++)
	  {
		  for (int j=0; j<a-i; j++)
		  {
			  System.out.print(" ");
		  }
		  for (int k=a; k>=a-i; k-- )
		  {
			  System.out.print("*"+" ");
		  }
		  System.out.println();
	  }
	  a=a-1;
	  for (int l=0; l<a; l++)
	  {
		  for (int n=0; n<=l; n++ )
			 {
				 System.out.print(" ");
			 }
		 for (int m=a; m>l; m--) 
		 {
			 System.out.print(" "+"*");
		 }
		
		 System.out.println();
	  }
	  
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern20 obj =new Pattern20();
		obj.Pattern(10);
	}

}
