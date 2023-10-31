package com.ArrayOfObject;
//7)Employee class is as follows .
//
//Employee {
//int empno ;
//String name ;
//
//Department dept ;}
//Where dept is object of department class. Department class
//as deptId and deptname.
//Write a program to create array of 3 employees. Each
//employee will have different department. 
public class DeptEmp5 {
	private String dept, name;
	private int did, idd ;
	Employee5 emp[];
	DeptEmp5()
	{
		dept="";
		did=0;
	}
	DeptEmp5(int id, String de, int ei, String nam)
	{
		dept=de;
		did=id;
		idd=ei;
		name=nam;
		
	}
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	public void setDid(int did)
	{
		this.did=did;
	}
	public void setEid(int Eid)
	{
		this.idd=idd;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId()
	{
		return idd;
	}
	public String getName()
	{
		return name;
	}
	public String getDept()
	{
		return dept;
	}
	public int getDid()
	{
		return did;
	}
	public String toString()
	{
		return " Department id " +did+ "\n" + " Department name " + dept + "\n" + " Employee id " + idd + "\n" + " Employee name " + name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeptEmp5 d1 = new DeptEmp5();
				System.out.println(d1);
				
				DeptEmp5 d2 = new DeptEmp5(1, "Science", 1, "Suraj" );
				System.out.println(d2);
	}

}
