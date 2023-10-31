package com.WithoutMainMethod;

public class FrequencyOfnum {
   public void checkfreq(int a)
   {   
	   int count;
	   for (int i=1; i<=9; i++)
	   {
		   count=0;
		   int temp=a;
		   while (temp>0)
		   {
			   int rem=temp%10;
			   if (rem==i)
			   count++;
			   temp=temp/10;
			   
		   }
		   if (count>0)
		   System.out.println(i+"="+count);
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrequencyOfnum obj =new FrequencyOfnum();
		obj.checkfreq(1233344433);
	}

}
