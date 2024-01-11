package com.test6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Employee {
	int eid;
	String ename;
	DepartmentQ3 dep;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int eid, String ename, DepartmentQ3 dep) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dep = dep;
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

	public DepartmentQ3 getDep() {
		return dep;
	}

	public void setDep(DepartmentQ3 dep) {
		this.dep = dep;
	}
	
	@Override
	public String toString() {
		return "\nEmployee [eid=" + eid + ", ename=" + ename + ", dep=" + dep + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Employee> list = new LinkedList<>();
		list.add(new Employee(1,"Suraj", new DepartmentQ3(12,"HR","Pune")));
		list.add(new Employee(2,"Abhishek", new DepartmentQ3(13,"IT","goa")));
		list.add(new Employee(3,"Yogesh", new DepartmentQ3(14,"Marketing","Pandharpur")));
		list.add(new Employee(4,"Sumit", new DepartmentQ3(15,"IT","Mumbai")));
		list.add(new Employee(5,"Snehal", new DepartmentQ3(16,"IT","Kolkata")));
		String str="";		
		for (Employee e : list) {
			if (e.eid==5) {
				str=e.dep.name;
			}
		}
		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext()) {
			Employee e= itr.next();
			if(e.dep.name==str&&e.eid!=5) {
				itr.remove();
			}
		}
		System.out.println(list);
		
		
//		ArrayList<Employee> list1 = new ArrayList<>();
//		
//		for (Employee d : list ) {
//			if (d.dep.name.equals(str)) {
//				list1.add(d);
//			}
//		}
//
//		list.removeAll(list1);
//
//		for (Employee g : list) {
//			System.out.println(g);
//		}

	}
}