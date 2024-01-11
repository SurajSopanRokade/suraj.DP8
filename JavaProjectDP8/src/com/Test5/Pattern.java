package com.Test5;

public class Pattern {
	public void pattern() {
		String str = "Java";
		char ch[]= str.toCharArray();
		for (int i=1; i<=ch.length; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(ch[j]);
			}
			System.out.println();
		}
		for (int k=1; k<=ch.length; k++) {
			for (int m=0; m<ch.length-k; m++) {
				System.out.print(ch[m]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p1 = new Pattern();
		p1.pattern();
	}

}
