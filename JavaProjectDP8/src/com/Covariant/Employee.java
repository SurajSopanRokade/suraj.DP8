package com.Covariant;

public class Employee {
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
	int eid;
	String name;
	Employee(){
		eid=0;
		name="";
	}
	Employee(int eid, String name){
		this.eid=eid;
		this.name=name;
	}
	public Employee getEmployee() {
		return new Employee(1, "Suraj");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee e1[]= new Employee[4];
//		e1[0]=new Employee(1, "Suraj");
//		e1[1]=new Employee(2, "Su");
//		e1[2]=new Employee(3, "raj");
//		e1[3]=new Employee(4, "Sj");
		Employee e1 = new Employee();
		
	}

}
