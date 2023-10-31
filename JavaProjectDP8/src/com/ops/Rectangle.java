package com.ops;
import java.util.Scanner;
public class Rectangle {
	public int area(int a, int b)
	{
			int area=a*b;
			return area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int l=sc.nextInt();
		System.out.println("Enter breadth");
		int b=sc.nextInt();
		Rectangle obj =new Rectangle();
		Rectangle obj1=obj;
		
		//int res = obj1.area(l, b);
		//System.out.println(res);
		//int res1 = obj.area(l, b);
		//System.out.println(res1);
		//Rectangle obj1 =new Rectangle();
		//int res= obj.area(l, b);
		//System.out.println(res);
	}

}
