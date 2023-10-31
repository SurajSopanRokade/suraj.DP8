package com.NestedLoop;
//*1*
//*121*
//*12321*
//*1234321*
//*123454321*
//*1234321*
//*12321*
//*121*
//*1*

public class Pattern5 {
	public int revnum(int b) {
		int revnum = 0;
		while (b > 0) {
			int rem = b % 10;
			revnum = revnum * 10 + rem;
			b = b / 10;
		}
		return revnum;
	}

	public void pattern(int a) {
		int d = 0;
		for (int i = 1; i <= a; i++) {
			System.out.print("*");
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				if (j == i) {
					d = d * 10 + j;

				}
				if ((j == i)) {
					int num = d;
					num = num / 10;
					int value = revnum(num);
					if (value != 0)
						System.out.print(value);
					System.out.print("*");
				}
			}
			System.out.println();
		}

		int g = d;

		while (g > 0) {
			g = g / 10;
			int h = g;
			h = h / 10;
			if (g != 0)
				System.out.print("*" + g);
			else
				System.out.print("*");
			if (h != 0) {
				int rev2 = revnum(h);

				System.out.print(rev2 + "*");
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern5 obj = new Pattern5();
		obj.pattern(5);
	}

}
