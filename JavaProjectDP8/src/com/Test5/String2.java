package com.Test5;

public class String2 {
	public void check() {
		String x = new String("xyz");
		System.out.print(x+" ");
		String y = "abc";
		x = x + y;
		System.out.print(x+" ");
		System.out.print(y+" ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String2 s1 = new String2();
		s1.check();//3 objects will get created
	}

}
