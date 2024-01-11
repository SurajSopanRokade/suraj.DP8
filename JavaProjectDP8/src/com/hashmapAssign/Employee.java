package com.hashmapAssign;

public class Employee {
	int empid,depid;
	String ename;
	double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, int depid, String ename, double salary) {
		super();
		this.empid = empid;
		this.depid = depid;
		this.ename = ename;
		this.salary = salary;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public int getDepid() {
		return depid;
	}


	public void setDepid(int depid) {
		this.depid = depid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", depid=" + depid + ", ename=" + ename + ", salary=" + salary + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
