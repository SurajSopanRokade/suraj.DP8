package com.Array;

public class PrintArrayInReverse {
	public void showArray(int a[])
	{
		for (int i=a.length-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintArrayInReverse a1 = new PrintArrayInReverse();
		int arr[]= {1,2,3,4,5};
		a1.showArray(arr);
	}

}
