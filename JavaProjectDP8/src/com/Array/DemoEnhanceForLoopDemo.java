package com.Array;

public class DemoEnhanceForLoopDemo {
	int arr[];
	DemoEnhanceForLoopDemo()
	{
		
		arr= new int [5];
		for (int i=0; i<arr.length; i++)
		{
			arr[i]=i;
			//0,1,2,3,4
		}
		
	}
	DemoEnhanceForLoopDemo(int o[])
	{
		arr=o;
	}
	public int addArrayElements()
	{
		int sum=0;
		for (int i:arr)
		{
			sum=sum+i;
		}
		return sum;
	}
	//return array from method
	public int [] reversearray()
	{
		int newArr []= new int [arr.length];
		int j=arr.length-1;
		for (int i=0; i<newArr.length; i++)
		{
			newArr[i]=arr[j];
			j--;
		}
		return newArr;
	}
	public void printElement()
	{
		for (int i : arr)
			System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoEnhanceForLoopDemo obj = new DemoEnhanceForLoopDemo();
		System.out.println(obj.addArrayElements());
		int objArr[]= {5,6,7,9};
	}

}
