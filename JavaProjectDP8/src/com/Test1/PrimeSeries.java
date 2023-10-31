package com.Test1;

//Q12. Write a code show prime numbers between the range of given numbers. 
//Accept range from user. Eg. Range given by user is 12 to 25 then out put should be 13,17,19,23.
public class PrimeSeries {
	public void calculate(int a, int b) {
		for (int i = a; i <= b; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					count = 1;

			}
			if (count == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeSeries p1 = new PrimeSeries();
		p1.calculate(13, 25);
	}

}
