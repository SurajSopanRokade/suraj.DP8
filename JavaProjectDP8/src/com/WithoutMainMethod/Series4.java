package com.WithoutMainMethod;
//3,9,10,30,31,93
public class Series4 {
	public void Seriesnum(int a) {
		int d = 3;
		System.out.println(d);
		for (int i = 1; i <= a; i++) {

			int b = d * 3;

			int c = b + 1;
			System.out.println(b);
			System.out.println(c);
			d = c;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series4 obj = new Series4();
		obj.Seriesnum(6);
	}

}
