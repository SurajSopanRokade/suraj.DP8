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
public class EmployeeArray5 {
	Employee5 emp [];
	DeptEmp5 dept [];
	EmployeeArray5()
	{
		
	}
	EmployeeArray5(DeptEmp5 d [])
	{
		dept=d;
		
	}
	public void setDept(DeptEmp5 d [], DeptEmp5[] dept)
	{
		this.dept=dept;
	}
	public void setEmp(Employee5 m [], Employee5[] emp)
	{
		this.emp=emp;
	}
	public DeptEmp5[] getDept()
	{
		return dept;
	}
	public Employee5[] getEmp ()
	{
		return emp;
	}
	
//	public void elementEmp()
//	{
//		for (int i=0; i<emp.length; i++)
//		{
//			System.out.println(emp[i]);
//		}
//	}
	public void elementDept()
	{
		for (int i=0; i<dept.length; i++)
		{
			System.out.println(dept[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee5 e1 []= new Employee5[3];
		e1[0]= new Employee5(1, "Suraj");
		e1[1]= new Employee5(2, "Su");
		e1[2]= new Employee5(3, "raj");
		
		DeptEmp5 [] d1 = new DeptEmp5[3];
		d1[0]= new DeptEmp5(1, "Science", 1 , "Suraj");
		d1[1]= new DeptEmp5(2, "Maths", 2, "Su");
		d1[2]= new DeptEmp5(3, "English", 3, "raj");
		
		
		EmployeeArray5 m1 = new EmployeeArray5(d1 );
		m1.elementDept();
		
	}

}
