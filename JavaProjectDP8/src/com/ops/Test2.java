package com.ops;

public class Test2 {
	int sid =1;
	String name="suraj";
	public void std()
	{
		sid=1;
		name="suraj";
	}
	public String toString()
	{
		return "Student id " + sid + " Name " + name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 obj = new Test2();
		obj.std();
		System.out.println(obj);
		
	}

}
