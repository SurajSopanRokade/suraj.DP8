package com.Test5;

public class StringOutPut {
	public void check() {
		 String S1="yes";
		 String S2="yes";
		 String S3=new String(S1);
		 S1.equals(S3);
		 System.out.print(S1==S2);
		 

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOutPut s1 = new StringOutPut();
		s1.check();
	}

}
