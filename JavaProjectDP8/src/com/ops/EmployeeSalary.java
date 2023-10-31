package com.ops;

public class EmployeeSalary {
	int eid;
	int salary;
	

	public void Employee(int id, int sal)
	{
		eid=id;
		salary=sal;
	}
	public void check(EmployeeSalary obj )
	{
		if (this.salary>obj.salary)
			System.out.println("Employee 1 salary is higher");
		else
			System.out.println("Employee 2 salary is higher");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeSalary obj = new EmployeeSalary();
		EmployeeSalary obj1 = new EmployeeSalary();
		obj.Employee(1, 45000);
		obj1.Employee(1, 44000);
		obj1.check(obj);
		
		
	}

}
