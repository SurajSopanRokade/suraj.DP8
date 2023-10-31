package com.Test1;
//Q3.Write Java Code to generate output as Specified…
//eg.Given number is 345 then show output of 3^1 +  4^2 +  5^3 so, 3+16+125 i.e. 144 

public class CheckOutput {
	public int count(int a)
	{ 	int count=0;
		while(a>0) {
		a=a/10;
		count++;
		}
		return count;
	}
	public int power(int c,int r)
	{
		int power=1;
		for (int i=0; i<c; i++)
		{
			power=power*r;
		}
		return power;
	}
	public void check(int b)
	{	int sum=0;
		while(b>0) {
			int cnt=count(b);
			int rem=b%10;
			int res=power(cnt, rem);
			sum=sum+res;
			b=b/10;
		}
		System.out.println("Sum is = " + sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckOutput c1 = new CheckOutput();
		c1.check(345);
	}

}
