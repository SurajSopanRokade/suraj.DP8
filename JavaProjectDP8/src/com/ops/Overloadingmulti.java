package com.ops;

public class Overloadingmulti {
	public void multi(int a, int b)
	{
		System.out.println("Multi int int "+a*b);
	}
	public void multi(int a, int b, float c)
	{
		System.out.println("Multi int int float "+a*b*c);
	}
	public void multi(int a, long b, float c)
	{
		System.out.println("Multi int long float "+a*b*c);
	}
	public void multi(int a, double b, float c)
	{
		System.out.println("Multi int double float "+a*b*c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloadingmulti obj = new Overloadingmulti();
		obj.multi(2,3);
		obj.multi(2,3,6);
		obj.multi(2,3,4);
		obj.multi(2,3,7);
		
		

	}

}
