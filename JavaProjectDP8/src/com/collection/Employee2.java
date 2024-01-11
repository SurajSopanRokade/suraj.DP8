package com.collection;
import java.util.*;
public class Employee2 implements Comparable<Employee2> {
	int empid,age,salary;
	String designation,empname;
	Department2 dept;
	
	Employee2(){
		empid=0;
		age=0;
		salary=0;
		designation="";
		empname="";
	}
	
	
	
	public Employee2(int empid,String empname,String designation, int age, int salary,   Department2 dept) {
		super();
		this.empid = empid;
		this.age = age;
		this.salary = salary;
		this.designation = designation;
		this.empname = empname;
		this.dept = dept;
	}



	@Override
	public String toString() {
		return "\nEmployee2 [empid=" + empid + ", age=" + age + ", salary=" + salary + ", designation=" + designation
				+ ", empname=" + empname + ", dept=" + dept + "]";
	}



	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public String getEmpname() {
		return empname;
	}



	public void setEmpname(String empname) {
		this.empname = empname;
	}



	public Department2 getDept() {
		return dept;
	}



	public void setDept(Department2 dept) {
		this.dept = dept;
	}

static class ComapratorAge implements Comparator<Employee2> {

		@Override
		public int compare(Employee2 o1, Employee2 o2) {
			// TODO Auto-generated method stub
			if (o1.age==o2.age)
				return 0;
			else if (o1.age>o2.age)
				return 1;
			else
				return -1;
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee2> emp = new ArrayList<Employee2>();
	    emp.add(new Employee2(101, "Ram", "Manager", 32,120000, new Department2("IT", 11, "Pune")));
	    emp.add(new Employee2(203, "Prashant", "Trainee", 35,45000, new Department2("HR", 32, "Mumbai")));
	    emp.add(new Employee2(402, "Aadarsh", "Team Lead", 28,70000, new Department2("Sales", 21, "Pune")));
	    emp.add(new Employee2(102, "Ram", "Manager", 38,90000, new Department2("Account", 89, "Chennai")));
	    emp.add(new Employee2(106, "Maruti", "Trainee", 32,53000, new Department2("IT", 31, "Banglore")));
	    emp.add(new Employee2(202, "Ishwar", "Director", 40,240000, new Department2("R&D", 10, "Nagpur")));
	    emp.add(new Employee2(111, "Sudarshan", "Supervisor", 31,210000, new Department2("HR", 8, "Delhi")));
	    emp.add(new Employee2(201, "Snehal", "Trainee", 32,32000, new Department2("Account", 45, "Mumbai")));
	    emp.add(new Employee2(203, "Sudarshan", "Manager", 36,75000, new Department2("Marketing", 23, "Delhi")));
	    emp.add(new Employee2(301, "Pavan", "Team Lead", 29,85000, new Department2("Sales", 18, "Pune")));
		
	    
//	    System.out.println(emp);
//	    Collections.sort(emp);
//	    System.out.println(emp);
//	    CompareBySalary obj = new CompareBySalary();
//	    Collections.sort(emp, obj);
//	    System.out.println(emp);
//	    ComapratorAge obj1 = new ComapratorAge();
	    Collections.sort(emp, new Employee2.ComapratorAge());
	    System.out.println(emp);
//	    String str ="Pune";
//	    for (int i=0; i<emp.size(); i++) {
//	    	if(emp.get(i).dept.location==str)
//	    		System.out.println(emp.get(i));
//	    }
//	    String depname="IT";
//	    Employee2 s = new Employee2();
//	    for (int i=0; i<emp.size(); i++) {
//	    	if (emp.get(i).dept.depname==depname) {
//	    		int max=0;
//	    		if (emp.get(i).salary>max)
//	    			max=emp.get(i).salary;
//	    			s=emp.get(i);
//	    	}
//	    		
//	    }
//	    System.out.println(s);
//	    String str = "R";
//	    for (int i=0; i<emp.size(); i++) {
//	    	if (emp.get(i).empname.charAt(0)==str.charAt(0))
//	    	System.out.println(emp.get(i));
//	    }
	}

	
	public int compareTo(Employee2 o) {
		
		
		// TODO Auto-generated method stub
//		if(this.empid==o.empid)
//			return 0;
//		else if(this.empid>o.empid)
//			return 1;
//		else
//			return -1;
		 return dept.location.compareTo ( o.dept.location);
		
			
		
	}


}
