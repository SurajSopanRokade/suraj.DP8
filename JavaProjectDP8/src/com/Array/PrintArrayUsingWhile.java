package com.Array;

public class PrintArrayUsingWhile {
	public void print(int a[])
	{  int i=0;
		while (a.length>i)
		{
			System.out.println(a[i]);
		  i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintArrayUsingWhile a1 = new PrintArrayUsingWhile();
		int arr[]= {5,6,7,4,9};
		a1.print(arr);
	}

}
