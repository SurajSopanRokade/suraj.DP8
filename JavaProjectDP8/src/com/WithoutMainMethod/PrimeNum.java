package com.WithoutMainMethod;
//2,3,5,7,11,13,17
public class PrimeNum {
   public void prime (int a)
   {
	   for (int i=2; i<=a; i++)
	   {  int count=0;
		   for (int j=2; j<i; j++)
		   {
			   if (i%j==0)
				   count=1;
			   
				   
		   }
		   if (count==0)
			   System.out.println(i);
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNum obj =new PrimeNum();
		obj.prime(40);
	}

}
