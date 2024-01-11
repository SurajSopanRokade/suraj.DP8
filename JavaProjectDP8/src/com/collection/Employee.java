package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//6. Let employee class have a department object. Iterate through aarraylist of employees.
//7.Use copy method of collections class to make a copy of given arraylist of employees. 
//Check if it creates shallow copy or deep copy. Check if department objects are also copied.
//9.Sort arraylist of employees on employee names using comparable interface.
//11.Create arraylist ‘arrList’ within an arraylist. 
//Use contains and containsall method to check if given element and arraylists are present in ‘arrList’
//12.Iterate through arraylist using foreach.
public class Employee implements Comparable <Employee>{
	int empid;
	String ename,address;
	int salary;
	Department dept;
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", address=" + address + ", salary=" + salary
				+ ", dept=" + dept + "]";
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public Department getDept() {
		return dept;
	}


	public void setDept(Department dept) {
		this.dept = dept;
	}


	public Employee(int empid, String ename, String address, int salary, Department dept) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.address = address;
		this.salary = salary;
		this.dept = dept;
	}


	Employee(){
		empid=0; 
		ename="";
		address="";
		salary=0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1,"Suraj", "pune", 230000, new Department(1,"Science"));
		Employee e2 = new Employee(2,"Tsu", "pandharpur", 250000, new Department(2,"Biology"));
		Employee e3 = new Employee(3,"Raj", "solapue", 280000, new Department(3,"Maths"));
		
		ArrayList<Employee> obj = new ArrayList <Employee>(Arrays.asList(e1,e2,e3));
		System.out.println(obj);
		
		Collections.sort(obj);
		
		System.out.println(obj);
		
//		ArrayList<Employee> obj1 = new ArrayList <Employee>(Collections.nCopies(obj.size(), null));
//		Collections.copy(obj1,obj);
//		System.out.println(obj1);
//		e1.getDept().depname="English";
//		System.out.println(obj1);
		for (Employee i:obj) {
			System.out.println(i);
		}
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		int res = this.ename.compareTo(o.ename);
		return res;
	}

}
