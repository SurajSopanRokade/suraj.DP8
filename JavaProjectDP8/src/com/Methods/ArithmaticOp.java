package com.Methods;
//8)Write java Program for arithmetic operation for each operation write separate Method.
public class ArithmaticOp {
	int num1;
	int num2;
	int add, sub, multi;
	public void addition(int num1, int num2)
	{
		add = num1+num2;
	}
	public void multi(int num1, int num2)
	{
		multi=num1*num2;
	}
	public void sub(int num1, int num2)
	{
		sub=num1-num2;
	}
	public String toString()
	{
		return " Add " + add + " multi " + multi + " sub " + sub;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmaticOp a1 = new ArithmaticOp();
		a1.addition(12,2);
		a1.multi(12,2);
		a1.sub(12,2);
		System.out.println(a1);
	}

}
