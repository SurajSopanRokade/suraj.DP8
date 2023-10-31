package com.NestedLoop;
//1
//12
//123
//1234
//12345
//1234
//123
//12
//1
public class pattern3 {
	public void pattern(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		int d = (a - 1);
		for (int b = 1; b <= (a - 1); b++) {

			for (int c = 1; c <= d; c++) {
				System.out.print(c);

			}
			d--;
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern3 obj = new pattern3();
		obj.pattern(5);
	}

}
