package com.Array;
//1. WAP to have Department class created with id, name . Student class has
//roll, name and Department object should have id and name. Assign and
//print individual values in main method

public class StudentDep {
	private int roll;
	private String name;
	
	
	StudentDep()
	{
		roll=0;
		name="";
		
	}
	StudentDep(int roll, String name)
	{
		this.roll=roll;
		this.name=name;
	}
	public void setRoll(int roll)
	{
		this.roll=roll;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getRoll()
	{
		return roll;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return " Roll "+roll+" Name "+name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDep s1 = new StudentDep();
		System.out.println(s1);
		
		StudentDep s2 = new StudentDep(1, "Suraj");
		System.out.println(s2);
	}

}
