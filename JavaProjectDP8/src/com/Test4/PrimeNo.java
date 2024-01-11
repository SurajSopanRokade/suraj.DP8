package com.Test4;

public class PrimeNo {
	public void check(int n) {
		int t=0;
		int count;
		int sum=0;
		for (int i=2; i>0; i++) {
			count=0;
			for (int j=2; j<i; j++) {
				if(i%j==0)
					count=1;
			}
			if (count==0) {
				sum=sum+i;
				t++;
			}
			if (n==t)
				break;
		}
		System.out.println("Sum = " + sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNo p1 = new PrimeNo();
		p1.check(4);
	}

}
