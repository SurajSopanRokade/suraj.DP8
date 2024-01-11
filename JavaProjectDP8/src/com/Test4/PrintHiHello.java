package com.Test4;

public class PrintHiHello {
	public void check() {
		for (int i=1; i<=100; i++) {
			if (i%9==0)
				System.out.print("hi,");
			else if(i%3==0)
				System.out.print("Hello,");
			else
				System.out.print(i+",");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintHiHello p1 = new PrintHiHello();
		p1.check();
	}

}
