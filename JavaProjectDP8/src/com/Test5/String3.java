package com.Test5;

public class String3 {
	public void check() {
		String x = "xyz";
		x.toUpperCase(); 
		String y = x.replace('Y', 'y');
		y = y + "abc";
		System.out.println(y);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String3 s1 = new String3();
		s1.check();
	}

}
