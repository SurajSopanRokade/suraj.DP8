package com.test2;

public class Tech {
	public int count(int a) {
		int count=0;
		while(a>0) {
			a=a/10;
			count++;
		}
		return count;
	}
	public int power(int c) {
		int power=1;
		for(int i=1; i<=c/2; i++) {
			power=power*10;
		}
		return power;
	}
	public void check(int b) {
		int original=b;
		int cnt=count(b);
		int pow=power(cnt);
		int res=b%pow;
		int res1=b/pow;
		int sum=res+res1;
		sum=sum*sum;
		
		if (original==sum)
			System.out.println("Number is tech number");
		else
			System.out.println("Number is not tech number");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tech t1 = new Tech();
		t1.check(3025);
		
	}

}
