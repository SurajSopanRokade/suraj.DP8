package com.ArrayOfObject;
//3.	Create class Dept(did, dname), class MyDate(day, month, year)
//a.	Class Employee(emp_id, emp_name, salary, date(object), dept(object)).
//Create array of Employee and display the array elements.
//4.	Same as above but print Employees whose dept_name is same.
public class Employee3 {
	private int emp_id;
	private String emp_name;
	private int salary;
	
	Employee3()
	{
		emp_id=0;
		emp_name="";
		salary=0;
	}
	Employee3(int emp_id, String emp_name, int salary)
	{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.salary=salary;
	}
	public void setEmp_id(int emp_id)
	{
		this.emp_id=emp_id;
	}
	public void setEmp_name(String emp_name)
	{
		this.emp_name=emp_name;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getEmp_id()
	{
		return emp_id;
	}
	public String getEmp_name()
	{
		return emp_name;
	}
	public int getSalary()
	{
		return salary;
	}
	public String toString()
	{
		return " Emp_id " + emp_id +"\n"+ " Emp_name " + emp_name +"\n"+ " Salary " + salary;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee3 e1 = new Employee3();
		System.out.println(e1);
		
		Employee3 e2 = new Employee3(1, "Suraj", 23000);
		System.out.println(e2);
	}

}
