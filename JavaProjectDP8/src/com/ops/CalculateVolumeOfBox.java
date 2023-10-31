package com.ops;
import java.util.Scanner;
public class CalculateVolumeOfBox {
	public int volume (int a, int b, int c)
	{
	
		 int volume;
		 volume = a*b*c;
	
	return volume;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter height");
		int height=sc.nextInt();
		System.out.println("Enter length");
		int length=sc.nextInt();
		System.out.println("Enter breadth");
		int breadth=sc.nextInt();
		CalculateVolumeOfBox obj = new CalculateVolumeOfBox();
		int res=obj.volume(height, length, breadth);
		System.out.println(res);
	}

}
