package com.WithoutMainMethod;

public class StringTest {
	public void check(String str) {
		char ch []= str.toCharArray();
		for (int i=0; i<ch.length; i++) {
			int count=0;
			for (int j=i+1; j<ch.length; j++) {
				if (ch[i]==ch[j] ) {
					count++;
				}
			}
			if (count==0) {
				System.out.println("first " + ch[i]);
				break;
			}	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n="Peter Pan";
		StringTest s1 =new StringTest();
		s1.check(n);
	}

}
