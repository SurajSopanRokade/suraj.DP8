package com.WithoutMainMethod;

public class Armstrong2 {
	public int Count(int num) {
		int count = 0;

		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	public int Power(int b, int e) {
		int power = 1;
		for (int a = 0; a < e; a++) {
			power = power * b;
		}
		return power;
	}

	public boolean CheckArmstrong2(int num) {
		int cnt = Count(num);
		int original = num;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			num = num / 10;
			sum = sum + Power(rem, cnt);
		}
		if (original == sum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong2 obj = new Armstrong2();
		boolean res = obj.CheckArmstrong2(1634);
		if (res)
			System.out.println("Number is armStrong ");
		else
			System.out.println("Number is not armstrong ");
	}

}
