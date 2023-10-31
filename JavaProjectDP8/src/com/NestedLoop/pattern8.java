package com.NestedLoop;

public class pattern8 {
  public void pattern(int a)
  {
	  for (int i=0; i<=a; i++)
	  {
		  for (int j=0; j<=a; j++)
		  {
			  if (i==j)
				  System.out.print(i);
			  else
				  System.out.print("0");
			  
				  
				  
				  
			
			  
		  }
		  System.out.println();
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern8 obj =new pattern8();
		obj.pattern(4);
	}

}
