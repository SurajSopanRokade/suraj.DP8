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

public class Employee5 {
	private int empno;
	private String name;
	
	Employee5()
	{
		empno=0;
		name="";
	}
	Employee5(int empno, String name)
	{
		this.empno=empno;
		this.name=name;
	}
	public void setEmpNo(int empno)
	{
		this.empno=empno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getEmpNo()
	{
		return empno;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return " Employee no " + empno +"\n"+ " Employee Name " + name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
