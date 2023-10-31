package com.WithoutMainMethod;

public class PatternAlpha {
	public void Alpha(int a) {
		char ch='A';
		for (int i = 1; i <= a; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
			}
			ch++;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatternAlpha obj = new PatternAlpha();
		obj.Alpha(5);
	}

}
