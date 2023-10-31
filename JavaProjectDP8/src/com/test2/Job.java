package com.test2;
//5.  Design  class Job with following fields (  id, Role, salary) [2M]
//Design class Person with following fields (id, name, mobile, Job )
//Relation-Person has a job .Write a program to create 2 person objects
//(by constructor).
public class Job {
	int id;
	String role;
	int salary;
	
	Job(){
		id=0;
		role="";
		salary=0;
	}
	Job(int id, String role, int salary){
		this.id=id;
		this.role=role;
		this.salary=salary;
	}
	public String toString() {
		return " ID "+id +"\n"+" Role " + role +"\n"+" Salary "+salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
