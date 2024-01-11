package com.hashsetdemo;
//12. WAP to add user defined objects of type Employee in a HashSet. 
//Print the contents in the Set.
public class Employee {
	int eid;
	String ename;
	int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	public int hashCode() {
		return this.eid+ename.hashCode();
	}
	public boolean equals(Object o) {
		Employee e = (Employee) o;
		if(this.eid==e.eid&&this.ename.equals(e.ename))
		return true;
		else
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
