package com.ops;

public class EmployeeId {
	static int count=100;
	String name;
	float salary;
	int empid;
	
	public EmployeeId() 
	{
		empid=count++;
	}
	
	
	public EmployeeId( String nam, float sal)
	{
		empid=count++;
		name=nam;
		salary=sal;
		
	}
	public void display()
	{
		System.out.println("Employee id  = " + empid);
		System.out.println("Employee name  = " + name);
		System.out.println("Employee salary  = " + salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeId obj = new EmployeeId ("suraj", 34000);
		obj.display();
		EmployeeId obj1 = new EmployeeId ("s", 33000);
		obj1.display();
		EmployeeId obj2 = new EmployeeId ("u", 32000);
		obj2.display();
		EmployeeId obj3 = new EmployeeId ("r", 31000);
		obj3.display();
		
	}

}
