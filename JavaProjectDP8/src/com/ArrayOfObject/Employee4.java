package com.ArrayOfObject;
//6)Write a Java program to create array of Employee objects.
//Employee class has empNo , name. Array size should be 5.Make use of for loop.

public class Employee4 {
	private int empNo;
	private String name;
	Employee4()
	{
		empNo=0;
		name="";
	}
	Employee4(int empNo, String name)
	{
		this.empNo=empNo;
		this.name=name;
	}
	public void setEmpNo(int empNo)
	{
		this.empNo=empNo;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getEmpNo(int empNo)
	{
		return empNo;
	}
	public String getName(String name)
	{
		return name;
	}
	public String toString()
	{
		return " Emp no " + empNo +"\n"+ " Name " + name ;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee4 e1 = new Employee4();
				System.out.println(e1);
				
				Employee4 e2 = new Employee4(1, "Suraj");
				System.out.println(e2);	
	}

}
