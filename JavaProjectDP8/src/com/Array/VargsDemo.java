package com.Array;

public class VargsDemo {
	public int add(int...n)
	{
		int sum=0;
		for (int i:n)
		{
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VargsDemo a1 = new VargsDemo();
		int arr[]= {1,2,3,4,5};
		int arr1[]= {3,4,5,6};
		int res=a1.add(arr1)	;
		System.out.println(res);
		
		
	}

}
