package com.WithoutMainMethod;

public class OddNumBet1To30 {
	public void OddNum(int a) {
		for (int i = 1; i <= a; i++) {
			if (i % 2 != 0)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddNumBet1To30 obj = new OddNumBet1To30();
		obj.OddNum(30);
	}

}
