package com.Array;

public class SumOfEvenNumbersFromArray {
    	public int sum (int a[])
    	{  int sum=0;
    		for (int i=0; i<a.length; i++)
    		{  
    			if (a[i]%2==0)
    			{
    				sum=sum+a[i];
    			}
    		}
    		return sum;
    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfEvenNumbersFromArray a1 = new SumOfEvenNumbersFromArray();
		int arr[]= {4,5,6,7,8};
		int res=a1.sum(arr);
		System.out.println(res);
		
	}

}
