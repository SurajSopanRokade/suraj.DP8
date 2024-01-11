package com.WithoutMainMethod;
//2,3,5,7,11,13,17
public class PrimeNum {
   public int prime (int a)
   {	int t=0;
   		int sum=0;
	   for (int i=2; i>0 ; i++)
	   {  int count=0;
		   for (int j=2; j<i; j++)
		   {
			   if (i%j==0)
				   count=1;
			      
		   }
		   if (count==0) {
			  
			   sum=sum+i;
			   t++;
		   }
		   if (a==t) {
			   t=t+1;
			   break;
		   }
		   
	   }
	   
	   return sum;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNum obj =new PrimeNum();
		int res=obj.prime(4);
		System.out.println(res);
	}

}
