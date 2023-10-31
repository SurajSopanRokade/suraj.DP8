package com.Array;
//1. WAP to have Department class created with id, name . Student class has
//roll, name and Department object should have id and name. Assign and
//print individual values in main method

public class Department {
	private int id;
	private String Dname;
	StudentDep depart [];
	Department()
	{
		id=0;
		Dname="";
	}
	Department(int id, String name, StudentDep depart [] )
	{   
		this.Dname=name;
		this.id=id;
		this.depart=depart;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.Dname=name;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return Dname;
	}
	public String toString()
	{
		return " Department id " + id + " Depart name " + Dname ;
	}
	public void printarry()
	{
		for (int i=0; i<depart.length; i++)
		{
			System.out.println(depart[i]);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d1 = new Department();
		System.out.println(d1);
		
		StudentDep D1 [] = new StudentDep [3];
		D1[0]= new StudentDep(1, "suraj");
		D1[1]= new StudentDep(2, "sj");
		D1[2]= new StudentDep(3, "aj");
		Department d2 = new Department(1, "science", D1);
		System.out.println(d2);
		d2.printarry();
	}

}
