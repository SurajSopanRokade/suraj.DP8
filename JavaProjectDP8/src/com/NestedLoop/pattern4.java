package com.NestedLoop;
//101010101
//010101010
//101010101
//010101010
//101010101
//010101010
//101010101
//010101010
//101010101
public class pattern4 {
  public void Pattern(int a)
  {
	  for (int i=1; i<=a; i++)
	  {
		  for (int j=1; j<=a; j++)
		  {  
			  if (i%2==0)
			  {
				  if (j%2!=0)
				  
					  System.out.print("0");
				  
				  else
					  System.out.print("1");
			  }
			  else
			  {
				  if (j%2==0)
					  System.out.print("0");
				  else
					  System.out.print("1");
			  }
			  
		  }
		  System.out.println();  
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern4 obj = new pattern4();
		obj.Pattern(9);
	}

}
